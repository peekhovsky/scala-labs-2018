package labs

import lab1.SequenceReiteration
import org.scalatest.FunSuite

import scala.util.Random

class SequenceReiterationTest extends FunSuite {
  private def getRandomIntArray():Array[Int] = {
    val array: Array[Int] = new Array[Int](Random.nextInt(100))
    for (i <- array.indices) {
      array(i) = Random.nextInt(10000)
    }
    array
  }

  test("SequenceReiteration") {
    val array = getRandomIntArray()
    assert(SequenceReiteration.getMaxRecursion(array).equals(SequenceReiteration.getMaxTailCall(array)))
  }
}
