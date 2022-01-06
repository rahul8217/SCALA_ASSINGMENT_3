import org.scalatest.funsuite.AnyFunSuite

class SCALA_ASSINGMENT_3_QUESTION_5_TEST extends AnyFunSuite{
  test(testName = "Validation of conditional function with boolean Output"){
    assert(SCALA_ASSINGMENT_3_QUESTION_5.conditional(4, SCALA_ASSINGMENT_3_QUESTION_5.checkBoolean, SCALA_ASSINGMENT_3_QUESTION_5.multiply) == 16)
    assert(SCALA_ASSINGMENT_3_QUESTION_5.conditional(6, SCALA_ASSINGMENT_3_QUESTION_5.checkBoolean, SCALA_ASSINGMENT_3_QUESTION_5.multiply) == 36)
  }


}
