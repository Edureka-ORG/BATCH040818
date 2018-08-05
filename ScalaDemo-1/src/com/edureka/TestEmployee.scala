package com.edureka

object TestEmployee 
{
  def main(args: Array[String]): Unit = {
    //Create 2 employees SAI, SURESH
    
    //Create employee SAI
    
    val saiObj = new Employee();
    saiObj.id = 1234567;
//    saiObj.org = "Wipro";
    saiObj.name = "SAI"
    saiObj.email="svaduka@wipro.com"
    saiObj.deptno=2
//    saiObj.location = "NANAKRAMGUDA"
    saiObj.doj=2017;
    saiObj.skillSet += "JAVA"
    saiObj.skillSet += "SCALA"
    saiObj.skillSet += "GITHUB"
    saiObj.skillSet += "SBT"
    
    println(saiObj)
    //Creating object for suresh
    
    val sureshObj = new Employee();
    sureshObj.id = 234566;
//    saiObj.org = "Wipro";
    sureshObj.name = "SURESH"
    saiObj.email="suresh@wipro.com"
    saiObj.deptno=3
//    saiObj.location = "NANAKRAMGUDA"
    saiObj.doj=2000;
    saiObj.skillSet += "PHP"
    saiObj.skillSet += "SCALA"
    saiObj.skillSet += "GITHUB"
    saiObj.skillSet += "ORACLE"
    
    println(sureshObj);
    
    
    
    var x = 10 + 20 
    
    var y = {
      var a = 10;
      var b = 20; 
      a+b
      }
    
    
    println(y)
    
    
  }
}