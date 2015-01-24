package com.example

object Collections{

 def minmax(l: List[Int]): (Int,Int) =
 {
    var max = l.head
    var min = l.head
    for(e <- l.tail)
      {
         max = if(e>max) e else max
         min = if(e<min) e else min
      }
    (min,max)
 }

}
