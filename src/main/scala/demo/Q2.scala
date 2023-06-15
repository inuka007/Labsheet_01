package demo

object Q2 {
  def main(args: Array[String]): Unit = {
    printf("The temperature in Fahrenheit is %f", temp_conv(35))
    //      println(temp_conv(35))
  }

  def temp_conv(c: Double): Double = c * 1.8 + 32

}