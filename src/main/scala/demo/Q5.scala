package demo

object Q5 {
  def main(args: Array[String]): Unit = {
    printf("The total running time is %f", easy(4) + tempo(3))
    //      println(calcVolume(5))
  }

  def easy(d : Double) = d/8
  def tempo(d : Double) = d/7


}