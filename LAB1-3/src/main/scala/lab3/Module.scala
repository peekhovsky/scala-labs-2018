package lab3

//Реализовать  функцию,  принимающую  число  (скалярное  или  комплексное)  и возвращающую его модуль

object Module {
  abstract class Number
  case class RealNum(x: Double) extends Number
  case class ComplexNum(x: Double, y:Double) extends Number

  def abs(number: Number):Double = {
    number match {
      case RealNum(x) => if (x < 0) x * (-1.0) else x
      case ComplexNum(x, y) => math.sqrt(math.pow(x, 2) + math.pow(y, 2))
    }
  }

  def main(args: Array[String]):Unit = {
    println(abs(RealNum(-3)))
    println(abs(ComplexNum(3, 4)))
  }
}
