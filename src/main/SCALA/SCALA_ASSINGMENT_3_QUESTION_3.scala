object SCALA_ASSINGMENT_3_QUESTION_3 extends App {
  def initializingValue(num1: Int): Int ={
    num1
  }
  def productAfterInitialization(f: Int => Int): Int => Int ={
    (x: Int) => f(4) * x
  }
  val callFunction = productAfterInitialization(initializingValue)
  println(callFunction(452))

}
