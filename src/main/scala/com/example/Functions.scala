package com.example
import collection.mutable.ListBuffer

object Functions {

  def removeIf(fn: Int => Boolean,l: List[Int]): ListBuffer[Int]= {

    var res=ListBuffer.empty[Int]
    for(e <- l)
      if(!fn(e))
        res+=e
    res
   }

 def evens(L: Vector[Int]): ListBuffer[Int]=
 {
   var res=ListBuffer.empty[Int]
   for(e <- L)
      if(e%2==0)
       res+=e
   res
 }

  def twice(fn: Int => Int,V: Int)=fn(fn(V))

 def Zip3[A,B,C](l1: List[A],l2: List[B],l3: List[C]): List[(A,B,C)]= l1 zip l2 zip l3 map { case ((x,y),z) => (x,y,z)}


}
