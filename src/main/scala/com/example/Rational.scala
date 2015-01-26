package com.example


// no parenthesis no side effects
// primary constructor
class Rational(val n: Int,val d: Int) {

  // auxillary constructors
  def this(n: Int)={
    this(n,1) // call to primary constructor
  }
  def add(that: Rational): Rational= new Rational(this.n*that.d+that.n*this.d,this.d*that.d)
  def +(that: Rational): Rational= new Rational(this.n*that.d+that.n*this.d,this.d*that.d)
  override def toString=n+"/"+d
  // PROBLEM: reduce the num and then using greatest common divisor
}
