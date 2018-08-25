package com.edureka

object TestFunction {
  def main(args: Array[String]): Unit = {
    println(add(10,20));
  }
  
  def add(i:Int, j:Int):Int = {
    return i+j;
  }
}