import org.scalatest.funsuite.AnyFunSuite
import scala.util.Random
import util.Random._
class SCALA_ASSINGMENT_3_QUESTION_2_TEST extends AnyFunSuite{
  test(testName = "Finding largest, smallest and last elements from a function which takes two values randomly"){
    assert(SCALA_ASSINGMENT_3_QUESTION_2.findingMaximumValue(24,42) == 42)
    assert(SCALA_ASSINGMENT_3_QUESTION_2.findingMinimumValue(72,27) == 27)
    assert(SCALA_ASSINGMENT_3_QUESTION_2.returnLastValue(87, 67) == 67)
  }

}
