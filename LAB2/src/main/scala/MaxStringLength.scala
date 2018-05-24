//1: 27. Отсортировать коллекцию пузырьком
//2: 8. Вернуть последний элемент списка.
//3: 11. Найти строку с максимальной длиной в List[String]. IN: List("I", "You", "We") OUT: "You"
//
// Задание к лабораторной работе - выполнить задания трех частей согласно варианту.
// • в части 2 использовать fold;
// • в части 3 использовать map/flatMap/filter/reduce.


object MaxStringLength {
  val list = List("1RockRockRock", "2RockRockRock", "3RockRockRockRockRockRock", "4Rock")
  def getMaxLengthString(list: List[String]): String = {
    list.reduce({(a: String, b: String) => if (a.length > b.length) a else b})
  }

  def main(args: Array[String]): Unit = {
    //println(list)
    //println(getMaxLengthString(list))
  }
}
