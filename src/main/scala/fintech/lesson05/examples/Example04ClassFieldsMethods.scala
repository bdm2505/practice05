package fintech.lesson05.examples

object Example04ClassFieldsMethods extends App {
  class MyClass(x: Int, val y: Int) {
    val eagerXY = x * y
    lazy val lazyXY = x * y
    def calcXY = x * y

    def calcXYZ(z: Int) = x * y * z
  }

  val mc = new MyClass(1, 2)
  //  println(mc.x)
  println(mc.y)

}
