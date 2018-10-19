package fintech.lesson05.examples

object Example08ClassDefValOverride extends App {

  class ParentClass {
    def anotherMethod: String = {
      println("call on anotherMethod")

      "anotherMethod"
    }

    println("Parent class instance initialized")
  }


  class ChildClass extends ParentClass {
    override val anotherMethod: String = "overridden " + super.anotherMethod

    println("Child class instance initialized")
  }

  val parentClassInstance = new ParentClass
  println(s"parentClassInstance.anotherMethod == ${parentClassInstance.anotherMethod}")
  println(s"parentClassInstance.anotherMethod == ${parentClassInstance.anotherMethod}")

  println

  val childClassInstance = new ChildClass
  println(s"childClassInstance.anotherMethod == ${childClassInstance.anotherMethod}")
  println(s"childClassInstance.anotherMethod == ${childClassInstance.anotherMethod}")


}
