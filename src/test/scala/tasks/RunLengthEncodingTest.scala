package tasks

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class RunLengthEncodingTest extends AnyFlatSpec with Matchers {

  "runLengthEncoding" should "work correctly" in {
    runLengthEncoding("") shouldEqual ""
    runLengthEncoding("A") shouldEqual "A1"
    runLengthEncoding("AA") shouldEqual "A2"
    runLengthEncoding("QQQqwwweeeerrrrTy") shouldEqual "Q3q1w3e4r4T1y1"
    runLengthEncoding("QQQqwwweeeerrrrTyyy") shouldEqual "Q3q1w3e4r4T1y3"
  }

  private def runLengthEncoding(s: String): String = {
    // TODO Implement
    ???
  }

}
