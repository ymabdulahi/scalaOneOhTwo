object Option extends App {

  case class Chocolate (name: String, filling: Option[String])

  val snickers = Chocolate ("Snickers", Some("Nuts"))

  def getFilling (chocolate: Chocolate): String = {
    chocolate.filling match {
      case Some(value) => value
      case None => "no filling"
    }
  }

  case class Cat(name: String, mixedColour: Option[String])
  val soldier = Cat("Soldier", Some("Brown"))

  def getColour(cat: Cat): String = {
    cat.mixedColour match {
      case Some(value) => value
      case None => "one colour"
      case _ => "no fur"
    }
  }

  def num (n: Option[Int]): Int = {
    n match {
      case Some(n) => n * 2
      case _ => 0
    }
  }
}
