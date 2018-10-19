package fintech.lesson05.examples

object Example22TraitsSelfTyping extends App {
  class Bird(val mass: Double)

  trait Flying { self: Bird =>
    def fly(): Unit
  }

  trait Swimming { self: Bird =>
    def swim(): Unit
  }

  class Penguin extends Bird(5.0) with Swimming {
    override def swim(): Unit = println("Penguin swims")
  }

//  class Dino
//  class Pterodactyl extends Dino with Flying
//  compilation error

}
