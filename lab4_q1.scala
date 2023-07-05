package demo

import scala.io.StdIn

object lab4_q1 {
   def main (args: Array[String]): Unit={
      println("Enter your income: ")
      val income = StdIn.readInt()   //take income as user input

      val annual_interest = interest(income)  //calling the function
      println("Annual interest is : " + annual_interest)

   }

   def interest(amount:Int):Double = amount match{
      case x if x <=0 => 0
      case x if x<= 20000 => x*0.02
      case x if x<= 200000 => x*0.04
      case x if x<= 2000000 => x*0.035
      case x if x > 2000000 => x*0.065

   }

}
