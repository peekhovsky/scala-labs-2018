package credit


object Task3 {
  def someFunc[T](ls:List[T]):Either[String, T] = ls match {
    case Nil => Left("someFunc on empty list")
    case x :: Nil => Right(x)
    case _ :: xs => someFunc(xs)
  }

  def main(args: Array[String]): Unit = {
    println(someFunc(List(3, 4, 2, 6, -5)))
  }
}
