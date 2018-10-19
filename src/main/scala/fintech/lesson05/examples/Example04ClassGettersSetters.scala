package fintech.lesson05.examples

object Example04ClassGettersSetters extends App {
  class MyClass {

    var v: Double = 0

    def doubleV = v * 2
    def doubleV_=(dv: Double) = this.v = dv / 2
  }

  val mc = new MyClass

  mc.v = 12
  println
  println(s"v = ${mc.v}, doubleV = ${mc.doubleV}")

  println
  println("-" * 42)
  println

  mc.doubleV = 18
  println(s"v = ${mc.v}, doubleV = ${mc.doubleV}")
}
