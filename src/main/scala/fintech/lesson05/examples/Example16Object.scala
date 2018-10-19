package fintech.lesson05.examples

object Example16Object extends App {

  object PlainObject {
    val someValue = s"$this.someValue"
  }

  val plainObject: PlainObject.type = PlainObject

  class MyClass {
    def someMethod: String = s"$this.someMethod"
  }

  object ExtendingObject extends MyClass {
    def anotherValue = s"$this.anotherValue"
  }

  println(PlainObject.someValue)
  println(ExtendingObject.anotherValue)
  println(ExtendingObject.someMethod)
}
