package lo1_program_execution.memory

object Basics {

  def computeFactorial(n: Int): Int = {
    var result: Int = 1
    for (i <- 1 to n) {
      result *= i
    }
    result
  }

  def main(args: Array[String]): Unit = {
    val i: Int = 3
    val n = computeFactorial(i)
    println(n)
  }

}
