object SCALA_ASSINGMENT_3_QUESTION_4 extends App {
  def fzero[A](x: A)(f: A => Unit): A = { f(x); x }

  def fzero(x: String, f: String => Unit): String = {f(x); x }

}
