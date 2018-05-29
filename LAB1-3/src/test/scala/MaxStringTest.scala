import lab2.MaxStringLength
import org.scalatest.FunSuite


class MaxStringTest extends FunSuite {

  final val list = List("1Rock","2RockRockRock","3RockRockRockRockRock","4RockRock",
    "5RockRockRockRockRockRock","6Rock","7R","8RockRockRockRockRock","9Rock","10Rock","11RockRockRockRockRockRockRockRock")

  test("MaxStringLengthTest") {
    assert(list.last == MaxStringLength.getMaxLengthString(list))
  }
}
