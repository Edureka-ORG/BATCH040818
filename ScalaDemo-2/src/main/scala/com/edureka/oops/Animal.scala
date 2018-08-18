package com.edureka.oops

class Animal {
  def bark() {
    println("Barking");
  }
//  def dogBark(){
//     println("dog barking");
//  }
}

class Dog extends Animal {
  def dogBark(){
    super.bark();
  }
  
  override def bark() {
    println("dog barking");
  }
}