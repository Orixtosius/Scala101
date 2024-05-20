package Functions

object AnonymousFunctions extends App {
  val doubler: Int => Int = x => x * 2

  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

  val dosth: () => Int = () => 3

  val string2Int = { (str: String) =>
    str.toInt
  }

  val niceIncrementer: Int => Int = _ + 1 // x = x + 1
  val niceAdder: (Int, Int) => Int = _ + _ // (a, b) => a + b definitions should be given


  var superAdder = (x: Int) => (y: Int) => x + y

  var concatter = (a: String) => (b: String) => s"$a$b"

  println(dosth)
  println(dosth())
  println(superAdder(3)(4))
  println(concatter("Tu")("rk"))
}
