import org.scalatest.FunSuite


class BubbleSortTest extends FunSuite {

  final val list = List(445,2343,42324,234,34,23,46,32,3,63,622,25,5,3,-3,-56,-564,445)

  test("BubbleSortTest") {
    val bubbleSortedList = BubbleSort.bubbleSort(list)
    val correctlySortedList = list.sortWith(_ < _)

    assert(bubbleSortedList.size == correctlySortedList.size)
    assert(bubbleSortedList.equals(correctlySortedList))
  }
}
