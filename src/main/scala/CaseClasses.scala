object CaseClasses extends App {

  case class Dog(name: String, breed: String, age: Int)

  val Sam = Dog("Sam", "German Shepherd", 12)
  val Elon = Dog("Elon", "Shiba", 12)
  val Daisy = Dog("Daisy", "Beagle", 10)
  val Dog1 = Dog("Dog", "Pitbull", 10)

  case class Kennel(var name: String, var space: List[Object])

  val kennel = Kennel("Kennel", List(Sam, Elon, Daisy, Dog1))

  val new = kennel.copy(space = List(Sam, Elon, Daisy, Dog1, Soldier))

  case class Cat(name: String, breed: String, age: Int)

  val Soldier = Cat("Soldier", "Mixed", 6)
}
