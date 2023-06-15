package demo

object Q3 {
  def main(args: Array[String]): Unit = {
    printf("The Volume of a sphere with radius 5 is %f", calcVolume(5))
    //      println(calcVolume(5))
  }

  def calcVolume(rad: Double): Double = 4 / 3 * math.Pi * rad * rad * rad

}
