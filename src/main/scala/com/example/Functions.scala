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
}
