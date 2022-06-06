import scala.util.Random

object HighOrderFunctions2 extends App {

  // EXERCISE ONE

  // Accepts a String (SB character), returns a String(Quote) or Default Quote
  // Default Quote where no character is supplied

  val spongeBobQuote: (Option[String] => String = character =>  character match ) {
      case Some("Spongebob") => "Spongebob quote"
      case Some("Squidward") => "Squidward quote"
      case Some("Patrick") => "Patrick quote"
      case Some("Sandy") => "Sandy quote"
      case Some("Gary") => "Meow"
      case _ => "Default Quote"
  }

  // EXERCISE TWO

  val philosophyQuote = List("Quote 1", "Quote 2", "Quote 3")
  val returnQuoteOrPhilosophy: (Option[String]) => String = quote => quote match{
    case None => philosophyQuote(Random.nextInt(philosophyQuote.size))
    case Some(value) => value
  }

  // HOF to accept either of the quote functions
  def randomQuote(function: (Option[String]) => String, myStr: Option[String]) ={
    function match {
      case returnQuoteOrPhilosophy => function(myStr)
      case spongeBobQuote =>  function(myStr)
      case _ => "enter a valid function"
    }
  }
}
