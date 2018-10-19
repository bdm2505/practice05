package fintech.lesson05.examples

object Example18ObjectCompanionAndPrivate extends App {

  trait Linked[+T] {
    def head: T
    def tail: Linked[T]
  }

  class Link[T] private (val head: T, val tail: Linked[T]) extends Linked[T] {
    override def toString: String = s"$head :: $tail"
  }

  object Link {
    def apply[T](head: T, tail: Linked[T]): Linked[T] = new Link(head, tail)
  }

  object Empty extends Linked[Nothing] {
    override def head: Nothing = ???
    override def tail: Linked[Nothing] = ???

    override def toString: String = "Empty"
  }

  object Linked {
    def empty[T]: Linked[T] = Empty

    def apply[T](elems: T*): Linked[T] = {
      if (elems.isEmpty) Empty
      else Link(elems.head, apply(elems.tail: _*))
    }
  }

  val ints = Linked(1, 2, 3, 4)
  println(ints)

  val noStrings = Linked[String]()
}
