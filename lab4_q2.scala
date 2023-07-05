package demo

import scala.io.StdIn

object lab4_q2 {
  def main(args: Array[String]): Unit = {
    println("Enter the number : ")
    val num = StdIn.readInt()  //take the integer input

    println(pattern_Matching(num))  //calling and printing the function
  }

  def pattern_Matching(x : Int): String = x match{
    case x if x < 0 => "Negative Number"
    case x if x == 0 => "Zero"
    case x if x%2 ==0 => "Even Number"
    case x if x%2 != 0 => "Odd Number"
  }

}
