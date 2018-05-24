//1: 27. Отсортировать коллекцию пузырьком
//2: 8. Вернуть последний элемент списка.
//3: 11. Найти строку с максимальной длиной в List[String]. IN: List("I", "You", "We") OUT: "You"
//
// Задание к лабораторной работе - выполнить задания трех частей согласно варианту.
// • в части 2 использовать fold;
// • в части 3 использовать map/flatMap/filter/reduce.

object BubbleSort {

  val list = List(3, 5, 645, 343, 34, 345, 22, 36, 832, -4, 36)

  def main(args: Array[String]): Unit = {
    //sorting
    val bubbleSortedList = bubbleSort(list)

    //last element
    val lastByFold = list.fold(0){(m: Int, n: Int) => n}

    val lastByFoldLeft = list.foldLeft(0){(m: Int, n: Int) => n}

    //val lastByFoldRight = list.foldLeft(0){(m: Int, n: Int) => n}
    /*
    println(list)
    println(bubbleSortedList)
    println(lastByFold)
    println(lastByFoldLeft)
    */
  }

  def bubbleSort(a: List[Int]): List[Int] = {
    bubbleSortPerforming(a, List())
  }

  private def bubbleSortPerforming(a: List[Int], b: List[Int]): List[Int] = {
    if (a.isEmpty)  {
      b
    } else {
      //val minVal = a.min
      val minVal = getMin(a)
      bubbleSortPerforming(a diff List(minVal), b ::: List(minVal))
    }
  }

  private def getMin(list: List[Int]):Int = {
    list.reduce{(a:Int, b:Int) => if (a > b) b else a}
  }
}


