package Basics

object Inheritance extends App{

  //single class inheritance
  class Animal {
    protected def eat = println("nomnom")
  }

  class Cat extends Animal{
    def crunch = {
      eat
      println("Crunch")
    }
  }


  class Car(brand: String, age: Int) {
    def this(name: String) = this(name, 0)
    def drive(speed: Int) = println(s"Speed is $speed km/h.")
  }
  class SUV(brand: String, age: Int, capacity: Int) extends Car(brand){
    override def drive(speed: Int): Unit =
      println(s"Carries $capacity kg at $speed km/h.")
  }


  val hiddenCar: Car = new SUV("toyota", 1, 100)
  hiddenCar.drive(100)

}
