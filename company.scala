object company {
  def takeHsalary(normal: Double, ot: Double):Double= {
    val total: Double = ((normal * 250) + (ot * 85)) * 0.88
    return total
  }

  def main(args: Array[String]): Unit = {
    println("Number of normal hours worked: ")
    val normal: Double = scala.io.StdIn.readDouble()
    println("number of OT hours worked: ")
    val ot: Double = scala.io.StdIn.readDouble()
    println("the total take home salary of employee is ", takeHsalary(normal, ot), "rupees")
  }
}
