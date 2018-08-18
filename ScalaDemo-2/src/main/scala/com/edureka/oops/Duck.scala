package com.edureka.oops

class Duck {
  var size = 1;
  
  private var _age =0;
  
  //get method
  def age = {
    println("In Getter "+_age);
    _age;
  }
  
  //set method
  def age_=(age:Int):Unit = 
  {
    this._age = age;
    println("In Setter"+_age);
  }
  
}