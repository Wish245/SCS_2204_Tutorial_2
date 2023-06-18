object second {
  def main(args: Array[String]) = {
    val a: Int = 2
    val b: Int = 3
    val c: Int = 4
    val d: Int = 5
    val k = 4.3
    val g = 0
    println("--b*a+c*d-- =", (b-1)*a+c*d)
    println("a+1", a+1)
    println("-2*(g-k)+c",-2*(g-k)+c)
    println("c=c++",(c+1))
    println("c=++c*a++", c*(a+1))
  }
}