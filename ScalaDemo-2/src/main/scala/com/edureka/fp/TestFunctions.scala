package com.edureka.fp

class TestFunctions {
  
  
  var a = 10;
  var f = (i:Int) => println(i);
  
  add(a);
  add(f,a)
  def add(i:Int) {
    println(i);
  }
  
  def add(f:Int=>Unit,i:Int) {
    f(i)
  }
  
  def f2(x:Int):Int = x;
  
  def sumInts(a:Int, b:Int):Int = {
    if(a>b) {
      0
    }else {
   f2(a)+sumInts(a+1,b);
  }
  }
  def cube(x:Int):Int = x*x*x;
  
//  sumCubes(2,4)
  def sumCubes(a:Int, b:Int):Int ={
    if(a>b) {
      0
    }else {
   cube(a)+sumCubes(a+1,b); 
  }
  }
  def fact(x:Int):Int = {
    if(x==0)
    {
      return 1;
    }else {
    x*fact(x-1);
    }
  }
  def factorial(a:Int, b:Int):Int ={
    if(a > b) {
      0
    }else {
   fact(a)+factorial(a+1,b);
  }
  }
  
  var scp = hof(cube, 10,20)
  var sI = hof(f2,10,20)
  var sf = hof(fact,10,20)
  
  def hof(f:Int=>Int, a:Int, b:Int):Int = {
    if(a > b) {
      return 0;
    }
    
    f(a)+hof(f,a+1,b)
  }
  
}