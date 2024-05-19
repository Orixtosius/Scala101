import Functions.concatOperator

object TestCustomFunctions extends App{
  val receivedValue = concatOperator("Tu", "rk")
  assert(receivedValue == "Turk", s"Received value $receivedValue does not match.")
}