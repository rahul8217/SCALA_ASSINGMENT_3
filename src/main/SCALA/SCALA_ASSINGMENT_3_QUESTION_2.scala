import scala.util.Random
import scala.util.Random._

object SCALA_ASSINGMENT_3_QUESTION_2 extends App {
  val val1 = Random.nextInt()
  val val2 = Random.nextInt()
  def findingMaximumValue(num1: Int, num2: Int): Int = {
    if (num1 >= num2)
      num1
    else
      num2
  }
  def findingMinimumValue(num1: Int, num2: Int): Int = {
    if (num1 <= num2)
      num1
    else
      num2
  }
  def returnLastValue(firstValue: Int, lastValue: Int): Int = lastValue

  def validatingAllFunction(f: (Int, Int) => Int, g: (Int, Int) => Int, h: (Int, Int) => Int): Any = {
  var totalSum = 0
  totalSum += f(val1, val2) + g(val1, val2) + h(val1, val2)

  println(f(val1, val2))
  println(g(val1, val2))
  println(h(val1, val2))
  }
  validatingAllFunction(findingMaximumValue, findingMinimumValue, returnLastValue)
  println()
  println(val1)
  println(val2)
}
