package com.edureka

class TestLazy2 
{
  lazy val y = { println("TestLazy 2");Thread.sleep(10000);100 }
}