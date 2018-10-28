package credit

import scala.annotation.tailrec

object Task1 {

  @tailrec
  def mul(ls:List[Int], res:Int, i:Int):Int = {
    if (i == ls.size) res
    else mul(ls, res*ls(i), i + 1)
  }

  def multiply(ls:List[Int]): Int = {
    mul(ls, 0, 0)
  }
}
