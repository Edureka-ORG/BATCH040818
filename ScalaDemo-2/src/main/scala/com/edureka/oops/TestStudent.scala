package com.edureka.oops

object TestStudent extends App{
  
  val s1 = new Student(1,"aaa");
  val s2 = new Student(1,"aaa");
  println(s1 == s2)
  val s3 = new Student(1,"bbb");
  println(s1 == s3)
  
  println(s1.productArity)
  val s4 = s1.copy(2, "aaa")
  println(s4)
  
  val s5 = Student.apply(22, "XXXX");
  var opt = Student.unapply(s5);
  println(opt)
  
}