package com.example

object Hello {
  def main(args: Array[String]): Unit = {
    val lr=loopsrecursion
    lr.NDots(6)
    println(lr.power(2,10))
    println(lr.sumupto(10))
    lr.reverse(List("a","n","n","i","h","c")).foreach(println)

  }
}
