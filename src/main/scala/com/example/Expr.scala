package com.example

/**
 * Created by Rajesh on 2/2/2015.
 */
 abstract class Expr

case class Number(num: Double) extends Expr
case class Var(name: String) extends Expr
case class UnaryOp(op: String,arg: Expr) extends Expr
case class BinaryOp(op: String,arg1: Expr,arg2: Expr) extends

// wildcard pattern : _
// variable pattern
// constant pattern,tuple pattern
// constructor pattern
def reduceExpr(exp: Expr): Expr= exp match{
  case UnaryOp("-",UnaryOp("-",e)) => e
  case BinaryOp("+",e,Number(0)) => e
  case BinaryOp("*",e,Number(0)) => e
  //...
  case Var(x) => Var(x)
  case _ => expr
}

def pr(x: Any) : String= x match{
  case 1 => "Number1"
  case true => "Boolean True"
  case "Hello" => "String Hello"
  case Nil => "Empty List"
  case _ => "unrecognised value"
}

def pr2(x: Any) : String= x match{
  case _: Int => "unrecognised value"
  case b: Boolean => "Boolean" + b
  case _: => "unknownType"
}

def tail(l: List[Int]): List[Int]= l match{
  case Nil => Nil
  case lst => lst.tail
  // case lst
}

def second(l: List[Int]): List[Int]= l match{
  case Nil => -1
  case hd :: Nil => -1
  case hd::sd::tail => sd
}


// execise: rewrite above code using if/else or switch or polymorphism , visitor pattern



