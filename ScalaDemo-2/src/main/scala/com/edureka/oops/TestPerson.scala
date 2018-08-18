package com.edureka.oops

object TestPerson extends App{
  
  val p = new Person(20);
  val p1 = new Person(30)
  println(MathUtil.add(p.id,p1.id))
  Person.getName();
  Person.i;
//  p.x;
}