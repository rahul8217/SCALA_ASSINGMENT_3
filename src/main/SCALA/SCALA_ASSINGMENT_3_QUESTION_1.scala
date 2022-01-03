object SCALA_ASSINGMENT_3_QUESTION_1 extends App{
  def findingMaximumValueFromFunction(num1: Int, num2: Int): Int = {
    if (num1 >= num2)
      num1
    else
      num2
  }
  def findingMaximumValueFromTuple(tuple1: (Int, Int, Int), f:(Int, Int) => Int): Int = {
    f(tuple1._1, f(tuple1._2, tuple1._3))
  }
  println(findingMaximumValueFromTuple(tuple1 = (12, 54,77), findingMaximumValueFromFunction))
  println(findingMaximumValueFromTuple(tuple1 = (84, 54,77), findingMaximumValueFromFunction))
  println(findingMaximumValueFromTuple(tuple1 = (84, 97,12), findingMaximumValueFromFunction))

}
