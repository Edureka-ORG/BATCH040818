package com.edureka.oops

class Person(var id:Int)
{
  
  println("Helloworld"+id);
  
  private var y = 20;
  
  def this(id:Int,name:String) 
  {
    this(id);
    println("Consutructor id"+id+Person.x);
  }
  
  def sayHello():Unit = {
    println("Helloworld");
  }
  
}
object Person {
  var i = 10;
  private var x = 20;
  def getName():String = 
  {
    "Test";
  }
}