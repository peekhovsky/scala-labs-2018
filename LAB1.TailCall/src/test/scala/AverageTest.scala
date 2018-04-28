import org.scalatest.FunSuite

import scala.util.Random

class AverageTest extends FunSuite {

  private def getRandomDoubleArray():Array[Double] = {
    val array: Array[Double] = new Array[Double](Random.nextInt(100))
    for (i <- array.indices) {
      array(i) = Random.nextDouble() + Random.nextInt(10000)
    }
    array
  }

  test("Average") {
    val array = getRandomDoubleArray()
    assert(Average.getAverage(array).equals(Average.getAverageTailCall(array)))
  }
}
