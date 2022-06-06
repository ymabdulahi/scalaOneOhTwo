object PatternMatching extends App {

  case class iceCream (flavour: String)

  val choc = iceCream("Chocolate")

  val doesChocMatch = choc match {
    case "Dark Chocolate" => "Dark Cocoa"
    case "Caramel" => "Carma"
    case _ => "random"
  }

  case class Pizza (size: Int, isStuffed: Boolean)

  var customerOrder = Pizza(7, false)

  customerOrder.size match {
    case 7 => println("Personal")
    var cost = 5.99
    case 9 => println("small")
      var cost = 10.99
    case 11 if customerOrder.isStuffed == true => println("medium with stuffed crust")
      var cost = 12.99 + 2.99
    case 11 => println("medium")
      var cost = 12.99
    case 13 if customerOrder.isStuffed == true => println("large with stuffed crust")
      var cost = 14.99 + 2.99
    case 13 => println("large")
      var cost = 14.99
    case _ => println("medium")
      var cost = 12.99
  }


  case class Capital (capital: String)
  val london = Capital("london")

  def isCapital (capital: String): String = {
    capital match {
      case "london" => "London"
      case "edinburgh" => "Edinburgh"
      case "cardiff" => "Cardiff"
      case "belfast" => "Belfast"
      case _ => s"$capital is not a UK capital"
    }
  }


  abstract class Animal {
    val name: String
    val age: Int
  }

  case class Cat(name: String, age: Int) extends Animal

  var soldier = Cat("Soldier", 7)

  def checkAnimal(animal: Animal) = {
    animal match {
      case cat: Cat => "My cat"
      case _ => "Random ass animal"
    }
  }

  def isSoldier (animal: Animal): String = {
    animal.name match {
      case "Soldier" => s"${animal.name}'s name is Soldier and he is ${animal.age} years old"
      case _ => "This animal ain't Soldier"
    }
  }

}
