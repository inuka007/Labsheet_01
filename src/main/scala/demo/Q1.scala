package demo

object Q1 {
  def main(args: Array[String]): Unit = {
        printf("The area of the disk is %f", Area(5))
//      println(Area(5))
  }

  def Area(rad: Double): Double = math.Pi * rad * rad * rad

}

