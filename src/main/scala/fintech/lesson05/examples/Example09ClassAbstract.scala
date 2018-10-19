package fintech.lesson05.examples

object Example09ClassAbstract extends App {

  abstract class ParentClass {
    def anotherMethod: String
  }

  class ChildClass extends ParentClass {
//    def anotherMethod: String = "overridden " + super.anotherMethod
    def anotherMethod: String = "implemented anotherMethod"
  }

  val childClassInstance = new ChildClass
  println(s"childClassInstance.anotherMethod == ${childClassInstance.anotherMethod}")


}
