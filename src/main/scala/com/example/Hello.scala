package com.example

object Hello {
  def main(args: Array[String]): Unit = {
    val lr=LoopsRecursion
    val minmax=Collections.minmax(List(3,10,6,8,7,12,90))
    lr.nDots(6)
    println(lr.power(2,10))
    println(lr.sumUpto(10))
    lr.reverse(List("a","n","n","i","h","c")).foreach(println)
    println("min : " + minmax._1)
    println("max : " + minmax._2)
     val r1=new Rational(5,6)
    val r2=new Rational(1,3)
    println(r1.add(r2))
    println(r1 + r2)
    val funcs=Functions
    funcs.removeIf(x => x < 5,List(1,2,3,4,5,6,7,8,9,10,11)).foreach(println)
    funcs.evens(Vector(1,2,3,4,5,6,7,8,9,10,11)).foreach(println)
}
}
