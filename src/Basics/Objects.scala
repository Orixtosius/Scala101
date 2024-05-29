package Basics

object Objects extends App {

  // There is not static values in scala instead object is used
  object Car {
    val N_WHEELS = 4
    def canSwim: Boolean = false

    def apply(location: String): Car =
      if (location == "Japan") new Car("Mitsubishi")
      else new Car("BMW")
  }

  class Car(val brand: String) {
    override def toString: String = s"$brand"
  }

  //Companions : Object and Class Car

  println(Car.N_WHEELS)
  println(Car.canSwim)

  // Object is a singleton instance
  val porsche = Car
  val ferrari = Car
  println(porsche == ferrari)

  val toyota = new Car("toyota")
  val hyundai = new Car("hyundai")
  println(toyota == hyundai)

  println(Car("Japan"))
  println(Car("Germany"))
}
