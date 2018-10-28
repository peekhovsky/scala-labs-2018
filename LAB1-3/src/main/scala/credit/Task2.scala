package credit

import lab1.Average.{formatAverage, formatAverageTailCall}

object Task2 {

  def dropn(ls: List[Int], num: Int): List[Int] = {
    ls.foldLeft(ls) {(ls, _) => {
        ls.dropWhile(_ <= num)
      }
    }
  }

}
