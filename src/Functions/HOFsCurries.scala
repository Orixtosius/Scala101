package Functions

object HOFsCurries extends App{
  //val superFunction: (Int, (String, Int => Boolean) => Int) => (Int => Int) = ???
  // higher order function

  // map, flatMap, filter

  // function that applies a function n times over a value x
  // nTimes(f, n, x)
  // nTimes(f, 3 ,x) = f(f(f(x)))
  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if (n <= 0) x
    else nTimes(f, n-1, f(x))

  val plusOne: Int => Int = _ + 1

  val result = nTimes(plusOne, 3, 3)
  println(result)

  // increment10 ntb (plusOne, 10) = x => plusOne
  def nTimesBetter(f: Int => Int, n: Int): (Int => Int) =
    if (n <= 0) (x: Int) => x
    else (x: Int) => nTimesBetter(f, n-1)(f(x))

  val plus10 = nTimesBetter(plusOne, 1)(10)
  println(plus10)

  val superAdder: Int => (Int => Int) = (x: Int) => (y: Int) => x + y

  val add3 = superAdder(3)

  println(add3(10))
  println(superAdder(2)(10))


  def curriedFormatter(c: String)(x: Double): String = c.format(x)

  val standardFormat: (Double => String) = curriedFormatter("%4.2f")
  val preciseFormat: (Double => String) = curriedFormatter("%10.8f")

  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))
}
