package Basics

import scala.language.postfixOps

object SyntacticSugars extends App{

  class Car(val brand: String, val model: String, val age: Int) {
    def hasModel(part: String): Boolean = part == model
    def raceAgainst(car: Car): String = s"${this.brand} is racing against ${car.brand}."
    def unary_! : String = s"This car is $model model of $brand !"
    // space between ! and : is important for avoid misunderstandings
    // unary only works with + - !
    def isWorking : Boolean = true
    // apply is a special method. It is like __call__ in python
    def apply(): String = s"VROOOOOM !!!!"

    def +(model: String): Car = new Car(this.brand, model, this.age)
    def unary_+ : Car = new Car(this.brand, this.model, this.age + 1)
    def race(raceway: String): String = s"$brand races on $raceway racing circuit."
    def races : String = this.race("Istanbul")
    def apply(speed: Int): String = s"$brand has reached $speed km/h."
  }

  val toyota = new Car("toyota", "corolla", 2020)
  val hyundai = new Car("hyundai", "accent", 2019)
  println(toyota hasModel "corolla") // infix notation or operator notation
  // this writing is allowed since the method takes only one parameter

  println(toyota raceAgainst hyundai)

  println(!toyota)

  //postfix notation if method does not take any parameters
  //Used rarely due to poor readability
  println(toyota isWorking)

  println(toyota())

  val anotherToyota = toyota + "Yaris"
  println(!anotherToyota)

  var olderToyota = +toyota
  println(olderToyota.age)

  println(toyota races)

  println(toyota(200))
}
