package com.edureka.oops

object TestDuck {
  
  def main(args: Array[String]): Unit = {
    
    var d = new Duck;
    println(d.size);
    d.size_=(10);
    println(d.size);
    
    println(d.age)
    d.age
    d.age = 10
    d.age
    d.age_=(10)
//    d.age_= 10
    
    d.age+=1
    d.age*=4
    d.age/=2
//    d.age?=1
    
    
    
  }
  
  
}