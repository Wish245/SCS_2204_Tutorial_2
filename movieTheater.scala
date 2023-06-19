object movieTheater {
  def totalProfit(ticketPrice: Int): Int = {
    val attendence: Int = 120 + (15 - ticketPrice) * 20 / 5
    val totCost: Int = 500 + attendence * 3
    val ticketRevenue = attendence * ticketPrice
    val profit = ticketRevenue - totCost
    return profit
  }

  def bestTicketval(): (Int, Int) = {
    var bestPrice: Int = 0
    var maxProfit: Int = Int.MinValue
    for (price <- 10 to 20) {
      val profit = totalProfit(price)
      if (profit > maxProfit) {
        maxProfit = profit
        bestPrice = price
      }
    }
    (bestPrice, maxProfit)
  }

  def main(args: Array[String]): Unit = {
    val (bestPrice, maxProfit) = bestTicketval()
    println(s"the best ticket price is Rs. $bestPrice with a profit of Rs. $maxProfit")
  }
}
