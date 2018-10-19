package fintech.lesson05.examples

object Example05ClassAccess extends App {

  class MyClass {
    def publicMethod: String = ???

    protected def protectedMethod: String = ???

    private def classPrivateMethod: String = ???

    private[examples] def upToPackage: String = ???
  }


  class MyClass2 private (x: Int) {
    ???
  }

}
