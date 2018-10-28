package credit

import org.scalatest.FunSuite

class Test extends FunSuite {

  test("Task1") {
    assert(Task1.multiply(List()) == 0)
    assert(Task1.multiply(List(1)) == 1)
    assert(Task1.multiply(List(1, 2, 4, 8, 3)) == 192)
  }


  test("Task2") {
    assert(Task2.dropn(List(), 0).equals(List()))
    assert(Task2.dropn(List(1,2,3,4,5), 2).equals(List(3,4,5)))
    assert(Task2.dropn(List(List(1, 2, 3), List(4, 5)).flatten, 2).equals(List(3, 4, 5)))
  }

  test("Task3") {
    assert(Task3.someFunc(List()) == Left("someFunc on empty list")) //None
    assert(Task3.someFunc(List(3)) == Right(3))
    assert(Task3.someFunc(List(3,4,5)) == Right(5))
    assert(Task3.someFunc(List(-3,-4,-5)) == Right(-5))
    assert(Task3.someFunc(List(-3,-4,-5).dropWhile(_ != -5)) == Right(-4))
  }


  test("Corecursion") {
    assert(Corecursion.fibonacci(0).equals(List()))
    assert(Corecursion.fibonacci(1).equals(List(1)))
    assert(Corecursion.fibonacci(2).equals(List(1,1)))
    assert(Corecursion.fibonacci(10).equals(List(1,1,2,3,5,8,13,21,34,55)))
    assert(Corecursion.fibonacci(-1).isEmpty)
  }
}
