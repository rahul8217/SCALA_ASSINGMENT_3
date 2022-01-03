import org.scalatest.funsuite.AnyFunSuite

class SCALA_ASSINGMENT_3_QUESTION_1_TEST extends AnyFunSuite{
  test(testName = "Finding maximum value from a function and then from a tuple") {
    assert(SCALA_ASSINGMENT_3_QUESTION_1.findingMaximumValueFromTuple(tuple1 = (12,54,77), SCALA_ASSINGMENT_3_QUESTION_1.findingMaximumValueFromFunction) == 77)
    assert(SCALA_ASSINGMENT_3_QUESTION_1.findingMaximumValueFromTuple(tuple1 = (84,54,77), SCALA_ASSINGMENT_3_QUESTION_1.findingMaximumValueFromFunction) == 84)
    assert(SCALA_ASSINGMENT_3_QUESTION_1.findingMaximumValueFromTuple(tuple1 = (84,97,12), SCALA_ASSINGMENT_3_QUESTION_1.findingMaximumValueFromFunction) == 97)
  }

}
