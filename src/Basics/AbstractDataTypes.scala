package Basics

object AbstractDataTypes extends App {
  abstract class Lesson {
    val subject: String
    def teach: Unit
  }

  class Mathematics extends Lesson{
    override val subject = "algebra"
    override def teach: Unit = println(s"$subject is being taught")
  }

  val maths = new Mathematics()


  trait SocialScience{
    def teach(subject: String): Unit
  }

  class Sociology(topic: String) extends Lesson with SocialScience{

    override val subject: String = topic
    override def teach: Unit = println("Lesson has been taught.")
    override def teach(subject: String): Unit = println(s"$subject of $topic is being taught.")
  }

  val class321 = new Sociology("Masses")
  class321.teach("Movement")


  //trait vs a.class
  //extend one class multiple can extend multiple traits
  //traits = behaviour, a. class is a type
}
