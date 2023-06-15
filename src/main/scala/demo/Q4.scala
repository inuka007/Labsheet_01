package demo

object Q4 {
  def main(args: Array[String]): Unit = {
    printf("The Total cost of books is %f", total_cost(60))
    //      println(calcVolume(5))
  }

  def ship_cost(copies: Double): Double = (copies - 50) * 0.75 + 50 * 3
  def disc(x: Double) = x * .4
  def book_price(p : Double) = p * 24.95
  def total_cost(y: Double) = book_price(y) + ship_cost(y) - disc(book_price(y))
}
