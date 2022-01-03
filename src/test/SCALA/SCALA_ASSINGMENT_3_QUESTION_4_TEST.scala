import org.scalatest.funsuite.AnyFunSuite

class SCALA_ASSINGMENT_3_QUESTION_4_TEST extends AnyFunSuite{
  test(testName = "Reviewing anothers programmers code") {
    assert("Hello"===SCALA_ASSINGMENT_3_QUESTION_4.fzero("Hello", s=> (s.reverse)))
  }

}
