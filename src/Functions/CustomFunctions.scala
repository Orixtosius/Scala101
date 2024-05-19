package Functions


//val concatOperator: ((String, String) => String) = new Function2[String, String, String] {
//  override def apply(element: String, secondElement: String): String = s"$element$secondElement"
//}

object CustomFunctions extends App{

  val adder: ((Int, Int) => Int) = new Function2[Int, Int, Int]{
    override def apply(a: Int, b: Int): Int = a + b
  }

  val concatOperator: ((String, String) => String) = new Function2[String, String, String] {
    override def apply(element: String, secondElement: String): String = s"$element$secondElement"
  }

  var recInt: Function1[Int, Function1[Int, Int]] = new Function1[Int, Function1[Int, Int]]{
    override def apply(element: Int): Function1[Int, Int] = new Function1[Int, Int] {
      override def apply(secondElement: Int): Int = element + secondElement
    }
  }

  println(adder(3,4))
  println(concatOperator("ISMA", "IL"))
  var supperAdder = recInt(3)
  println(supperAdder(1))
}