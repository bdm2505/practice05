package fintech.lesson05.examples

object Example23TraitsAbstractOverride extends App {

  trait Calculator {
    def calculate(i: Int): Int
  }

  trait AndThenDouble extends Calculator {
    abstract override def calculate(i: Int): Int = super.calculate(i) * 2
  }

  trait AndThenIncreaseByOne extends Calculator {
    abstract override def calculate(i: Int): Int = super.calculate(i) + 1
  }

  trait AndThenSquare extends Calculator {
    abstract override def calculate(i: Int): Int = {
      val calculated = super.calculate(i)
      calculated * calculated
    }
  }

  class Dummy extends Calculator {
    override def calculate(i: Int): Int = i
  }

  object Funky extends Dummy with AndThenIncreaseByOne with AndThenSquare with AndThenDouble

  println(Funky.calculate(1))
  println(Funky.calculate(2))
}
