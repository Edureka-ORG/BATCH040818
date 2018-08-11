package com.edureka

class TestLazy {
  
  val y = { println("TestLazy");Thread.sleep(10000);100 }
}