package lab1

//Найти длину наибольшей последовательности одинаковых чисел идущих подряд

import scala.annotation.tailrec

object SequenceReiteration {

  //tail call
  def getMaxTailCall(array: Array[Int]):Int = {
    @tailrec
    def getMax(array: Array[Int], i:Int, res:Int, counter:Int): Int = {
      if (i == array.length) {
        if (counter > res) counter
        else res
      }
      else if (i != 0 && array(i - 1).equals(array(i))) {
        getMax(array, i + 1, res, counter + 1)
      }
      else {
        if (counter > res) {
          getMax(array, i + 1, counter, 1)
        } else {
          getMax(array, i + 1, res, 1)
        }
      }
    }
    getMax(array, 0, 1, 1)
  }


  private def formatGetMaxTailCall(array: Array[Int]):String = {
    val str = "Max iteration of sequence: %d"
    str.format(getMaxTailCall(array))
  }


  //simple recursion
  def getMaxRecursion(array: Array[Int]): Int = {
    def getMax(array: Array[Int], i:Int, res:Int, counter:Int, rest:Int):Int = {
      if (i == array.length) {
        if (counter > res) counter + 1 - res
        else 1
      }
      else if (i != 0 && array(i - 1).equals(array(i))) {
        if (counter + 1 - res > 0) {
          getMax(array, i + 1, res, counter + 1, counter + 1 - res)
        } else {
          getMax(array, i + 1, res, counter + 1, 0)
        }
      }
      else {
        if (counter > res) {
          rest + getMax(array, i + 1, counter, 1, 0)
        } else {
          getMax(array, i + 1, res, 1, 0)
        }
      }
    }
    getMax(array, 0, 1, 1, 0)
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
