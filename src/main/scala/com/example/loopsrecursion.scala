package com.example

object LoopsRecursion {

  def nDots(n: Int) = for(e <- 1 to n) print(".")

  def power(x: Int,y: Int): Int =
  {
    var acc = 1
    for(e <- 1 to y)
      acc = acc * x
    acc
  }

  def sumUpto(n: Int): Int =
  {
    def loop(n1: Int, acc: Int): Int =
      if(n1 == 0) acc 
      else loop(n1 - 1, acc + n1)
    loop(n, 0)
  }

  def reverse[T](l: List[T]): List[T] = 
  {
     def loop(l1: List[T], acc :List[T]): List[T] =
       if(l1.isEmpty) acc 
       else loop(l1.tail, l1.head::acc)
    loop(l, List.empty)
  }
}
