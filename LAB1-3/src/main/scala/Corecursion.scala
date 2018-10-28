package credit

import lab3.Module.{ComplexNum, RealNum, abs}

object Corecursion {

  def fibonacci(q:Int):List[Int] = fib(1,1).take(q).toList

  private def fib(a: Int, b: Int):Stream[Int] = a #:: fib(b, a + b)


  def unfold[A,S](z: S)(f: S => Option[(A,S)]): Stream[A] = f(z) match {
      case None => Stream.empty[A]
      case Some((a, s2)) => a #:: unfold(s2)(f)
  }

  def fibUnfold: Stream[Int] = unfold((0,1))(l => Some((l._1,(l._2, l._1 + l._2))))

  def main(args: Array[String]):Unit = {
    println(fibUnfold.take(15).toList)
  }
}
