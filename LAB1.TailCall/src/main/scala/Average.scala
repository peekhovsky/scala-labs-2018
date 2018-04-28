// Найти среднее арифметическое

import scala.annotation.tailrec
import scala.util.Random

object Average {

  //tail call
  def getAverageTailCall(array: Array[Double]): Double = {
    getAverageTailCallPerforming(array, 0, 0)
  }

  @tailrec
  private def getAverageTailCallPerforming(array: Array[Double], i:Int, sum:Double):Double = {
    if (i == array.length) sum / array.length
    else getAverageTailCallPerforming(array, i + 1, sum + array(i))
  }

  private def formatAverageTailCall(array: Array[Double]):String = {
    val str = "Average (recursion): %.2f"
    str.format(getAverageTailCall(array))
  }

  //simple
  def getAverage(array: Array[Double]):Double = {
    array.sum / array.length
  }

  private def formatAverage(array: Array[Double]):String = {
    val str = "Average (simple): %.2f"
    str.format(getAverage(array))
  }

  //main
  def main(args: Array[String]):Unit = {
    println(formatAverage(Array(1.0,3.4,3.66,7.43,52.23,54.232)))
    println(formatAverageTailCall(Array(1.0,3.4,3.66,7.43,52.23,54.232)))
  }
}
