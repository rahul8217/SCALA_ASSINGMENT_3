object SCALA_ASSINGMENT_3_QUESTION_5 extends App {
  def conditional(num1: Int, p: Int => Boolean, f: Int => Int): Int = {
    if (p(num1))
      f(num1)
    else
      num1
  }
  def checkBoolean(num1: Int): Boolean = {
    if (num1 >= 0)
      true
    else
      false

  }
  def multiply(num1: Int): Int = {
    num1 * num1
  }
  println(conditional(4, checkBoolean, multiply))
  println(conditional(14, checkBoolean, multiply))

}
