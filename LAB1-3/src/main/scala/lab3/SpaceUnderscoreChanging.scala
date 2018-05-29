package lab3

// В  переданной  строке  заменить пробелы  на  нижнее
// подчёркивание,  а  нижнее подчёркивание на пробелы.

object SpaceUnderscoreChanging {
  def change(ch: Char):Char = ch match {
    case ' ' => '_'
    case '_' => ' '
    case _ => ch
  }
  def changeSpaces(str: String):String = {
    for (x <- str) yield change(x)
  }

  //main
  def main(args: Array[String]):Unit = {
    println(changeSpaces("rbgrgrg rgrg_efejifneifn_effeefe_ fefe"))
  }
}


