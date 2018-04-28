import scala.annotation.tailrec
//Найти длину наибольшей последовательности одинаковых чисел идущих подряд

object SequenceReiteration {

  //tail call
  def getMaxTailCall(array: Array[Int]):Int = {
    getMaxTailCallPerforming(array, 0, 1, 1)
  }

  @tailrec
  private def getMaxTailCallPerforming(array: Array[Int], i:Int, res:Int, counter:Int): Int = {
    if (i == array.length) {
      if (counter > res) counter
      else res
    }
    else if (i != 0 && array(i - 1).equals(array(i))) {
        getMaxTailCallPerforming(array, i + 1, res, counter + 1)
      }
      else {
        if (counter > res) {
          getMaxTailCallPerforming(array, i + 1, counter, 1)
        } else {
          getMaxTailCallPerforming(array, i + 1, res, 1)
        }
      }
  }
  private def formatGetMaxTailCall(array: Array[Int]):String = {
    val str = "Max iteration of sequence: %d"
    str.format(getMaxTailCall(array))
  }


  //simple recursion
  def getMaxRecursion(array: Array[Int]): Int = {
    getMaxRecursionPerforming(array, 0, 1, 1, 0)
  }

  private def getMaxRecursionPerforming(array: Array[Int], i:Int, res:Int, counter:Int, rest:Int):Int = {
    if (i == array.length) {
      if (counter > res) counter + 1 - res
      else 1
    }
    else if (i != 0 && array(i - 1).equals(array(i))) {
      if (counter + 1 - res > 0) {
        getMaxRecursionPerforming(array, i + 1, res, counter + 1, counter + 1 - res)
      } else {
        getMaxRecursionPerforming(array, i + 1, res, counter + 1, 0)
      }
    }
    else {
      if (counter > res) {
        rest + getMaxRecursionPerforming(array, i + 1, counter, 1, 0)
      } else {
        getMaxRecursionPerforming(array, i + 1, res, 1, 0)
      }
    }
  }

  private def formatGetMaxRecursion(array: Array[Int]):String = {
    val str = "Max iteration of sequence: %d"
    str.format(getMaxRecursion(array))
  }


  def main(args: Array[String]): Unit = {
    println(formatGetMaxTailCall(Array(3,4,5,6,7,8,9,4,4,4,5,6,3,3,3,2,2,2,2,2,2,2,7,4,6,4,4,4,4,4,4,4,4)))
    println(formatGetMaxRecursion(Array(3,4,5,6,7,8,9,4,4,4,5,6,3,3,3,2,2,2,2,2,2,2,7,4,6,4,4,4,4,4,4,4,4)))
  }
}
