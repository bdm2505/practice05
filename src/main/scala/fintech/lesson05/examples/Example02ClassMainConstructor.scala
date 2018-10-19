package fintech.lesson05.examples

object Example02ClassMainConstructor extends App {

  class MyClass(x: Int) {
    val field: Int = x * x
    var mutableField: Int = 0

    def method(y: Int): Int = x * y
  }

}
