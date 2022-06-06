object Interpolation extends App {

  val kevin = "Kevin"
  val amy = "Amy"

  // s Interpolation
  println(s"$kevin is older than $amy")

  val kevinAge = 25.123
  val amyAge = 21.099

  println(s"$kevin is ${kevinAge - amyAge} year older than $amy")

  // f Interpolation
  println(s"$kevin is " + f"${kevinAge - amyAge}%.1f" + s" years older than $amy")

  // String Interpolation to avoid the new lines from this string. "\n\n\n\n\n\n\n\nsameline\n\n"
  val raw: String = raw"\n\n\n\n\n\n\n\nsameline\n\n"
  println(raw)

  case class Person(name: String, age: Int, favAnime: List[Object])

  val yonis = Person("Yonis", 25, List("One Piece, DragonBall, TOG"))
}
