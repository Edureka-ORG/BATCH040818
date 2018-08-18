package com.edureka.oops

trait Logger {
  def log(msg:String);
  
  def printlnHello() = {
    println("hello");
  }
}

trait TimeStampLogger extends Logger {
  
  abstract override def log(msg:String) {
    super.log(new java.util.Date+""+msg);
  }
}
trait ShortenLogger extends Logger {
  
  abstract override def log(msg:String) {
    super.log(new java.util.Date+""+msg);
  }
}
trait test {
   def logtest(msg:String) {
     println("Test Log");
   }
}

class TestLogger extends Logger with test
{
   override def log(msg:String) {
    println("logging");
  }
}