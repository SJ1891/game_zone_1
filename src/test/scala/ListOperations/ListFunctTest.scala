package ListOperations

import org.scalatest.{Matchers, WordSpec}

class ListFunctionTest extends WordSpec with Matchers {
  "multiplyByTen" should {
    "multiply all elements of list by 10" in {
      val inputList = List(11, 22, 33)
      val actualOutputList = ListFunctions.multiplyByTen(inputList)
      actualOutputList should contain allOf(110, 220, 330)
    }
  }
}
