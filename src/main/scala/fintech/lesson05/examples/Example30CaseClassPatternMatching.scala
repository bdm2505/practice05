package fintech.lesson05.examples

object Example30CaseClassPatternMatching extends App {

  case class Rectangle(width: Double, height: Double)

  val rectangle = Rectangle(37, 42)

  rectangle match {
    case Rectangle(w, h) => println(s"Rectangle has width $w and height $h")
  }

  class Rectangle1(val width: Double, val height: Double)
  object Rectangle1 {
    def unapply(r1: Rectangle1): Option[(Double, Double)] = Some((r1.width, r1.height))
  }

  val rectangle1 = new Rectangle1(37, 42)

  rectangle1 match {
    case Rectangle1(w, h) => println(s"Rectangle1 has width $w and height $h")
  }

}
