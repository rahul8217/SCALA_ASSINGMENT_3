import org.scalatest.funsuite.AnyFunSuite

class SCALA_ASSINGMENT_3_QUESTION_3_TEST extends AnyFunSuite{
  test(testName = "Creating a function which takes a single integer and then passing a integer for product of the integer"){
    val f = SCALA_ASSINGMENT_3_QUESTION_3.productAfterInitialization((x: Int) => x)
    assert(f(8) == 32)
    assert(f(80) == 320)
  }

}
