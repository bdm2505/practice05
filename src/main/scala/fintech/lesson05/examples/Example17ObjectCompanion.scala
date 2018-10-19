package fintech.lesson05.examples

object Example17ObjectCompanion extends App {

  trait Linked[+T] {
    def head: T
    def tail: Linked[T]
  }

  class Link[T](val head: T, val tail: Linked[T]) extends Linked[T] {
    override def toString: String = s"$head :: $tail"
  }

  object Empty extends Linked[Nothing] {
    override def head: Nothing = ???
    override def tail: Linked[Nothing] = ???

    override def toString: String = "Empty"
  }

  object Linked {
    def empty[T]: Linked[T] = Empty

    def build[T](elems: T*): Linked[T] = {
      if (elems.isEmpty) Empty
      else new Link(elems.head, build(elems.tail: _*))
    }
  }

  val ints = Linked.build(1, 2, 3, 4)
  println(ints)
}
