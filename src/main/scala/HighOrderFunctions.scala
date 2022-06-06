object HighOrderFunctions extends App {

  // NEED TO GET MORE PRACTICE

  val pi = 3.14

  // function to calculate circumference
  val calcCircum: (Double) => Double = radius => 2 * pi * radius

  // function to calculate the area of a circle
  val calcArea: (Double) => Double = radius => pi * (radius * radius)

  // function that takes a list of radius as a param
  // either the area or circum functions
  // outputs a list of circle areas or circum
  def myHOF(function: (Double) => Double, list: List[Double]) = {
    list.map(function)
  }

  val myRadiusList = List(1.00, 2.00)

  println(myHOF(calcCircum, myRadiusList))
}
