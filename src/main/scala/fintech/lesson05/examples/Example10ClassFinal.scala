package fintech.lesson05.examples

object Example10ClassFinal extends App {

  class ParentClass {
    final def anotherMethod: String = "final anotherMethod"
  }

  class ChildClass extends ParentClass {
//    override def anotherMethod: String = "overridden " + super.anotherMethod
  }

  val childClassInstance = new ChildClass
  println(s"childClassInstance.anotherMethod == ${childClassInstance.anotherMethod}")
}
