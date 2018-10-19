package fintech.lesson05.exercises

import scala.annotation.tailrec

object Exercise01 {

  // Дан класс Comparator[A], который является оберткой вокруг функции сравнения compare: (A, A) => Int
  // Мы не доверяем пользователям в создании корректных компараторов,
  // поэтому мы решили сделать конструктор - private'ным, а сам класс - final

  // Нужно написать две реализации "по-умолчанию" для типов String и Double
  // и реализовать метод contramap[B](f: B => A): Comparator[B]

  // метод contramap позволяет пользователям создавать свои инстансы Comparator для произвольного типа B
  // из уже существующего инстанса для класса A если у него есть функция преобразования B => A
  // например можно сделать Comparator[Int] из Comparator[Double]:
  // val intComparator: Comparator[Int] = Comparator.double.contramap[Int](_.toDouble)

  final class Comparator[A] private (val compare: (A, A) => Int) {
    def contramap[B](f: B => A): Comparator[B] = ???
  }

  object Comparator {
    val double: Comparator[Double] = ???
    val string: Comparator[String] = ???
  }

  def main(args: Array[String]): Unit = {
    def max[T](list: List[T], cmp: Comparator[T]): T = {
      @tailrec
      def loop(m: T, current: List[T]): T =
        if (current.isEmpty) m
        else {
          val newMax = if (cmp.compare(m, current.head) >= 0) m else current.head
          loop(newMax, current.tail)
        }

      if (list.isEmpty) throw new NoSuchElementException
      else loop(list.head, list.tail)
    }



    val intComparator = Comparator.double.contramap[Int](_.toDouble)

    println(max(1 :: 4 :: 5 :: 3 :: 2 :: Nil, intComparator))

    // doesn't compile: constructor is private
    // val byLength1 = new Comparator[String](???)

    val byLength = intComparator.contramap[String](_.length)
    println(max("one" :: "two" :: "three" :: "four" :: "five" :: Nil, byLength))
  }
}
