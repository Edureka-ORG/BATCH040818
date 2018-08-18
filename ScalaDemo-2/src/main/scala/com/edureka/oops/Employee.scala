package com.edureka.oops

class Employee 
{
  private var _id = 0;
  var name = "";
  var salary:Float = 0f;
  private var panCardOfWipro:String = "ACPVC4567G"
  private val _org = "WIPRO"
  
  def org = _org;
  protected var emailId = "";
  
  id_=(1);
  
   def swipe():Boolean = {
    println("Swiped");
    true;
  }
   
   def id = _id;
   
   private def id_=(i:Int):Unit = this._id + i;
   
}