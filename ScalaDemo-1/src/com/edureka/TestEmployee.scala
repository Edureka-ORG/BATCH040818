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
    sureshObj.email="suresh@wipro.com"
    sureshObj.deptno=3
//    saiObj.location = "NANAKRAMGUDA"
    sureshObj.doj=2000;
    sureshObj.skillSet += "PHP"
    sureshObj.skillSet += "SCALA"
    sureshObj.skillSet += "GITHUB"
    sureshObj.skillSet += "ORACLE"
    
    println(sureshObj);
    
    
    
    if(saiObj.doj < 2015){
      println("senior developer");
    }else{
      println("Junior developer");
    }
    
    
    
    var x = 5 
    
    var y = {
      var a = 10;var b = 20; 
      println(a+b)
      }
    println("AFTER BLOCK");
    println(y)
    
    val s = if( x > 0 && x < 6) 0 else -1
    
    var marks = Array(35,45,55)
    
    for (subjectMarks <- marks)
    {
      println(subjectMarks)
    }
    
    for( skill <- saiObj.skillSet)
    {
      println(skill)
    }
    
    for ( i <- 0 until sureshObj.skillSet.length){
      
      println(sureshObj.skillSet(i))
    }
    
    val fn = (x:String) => println(x)
    
    saiObj.skillSet.foreach(skill => fn(skill))
    
    
    for( skill <- saiObj.skillSet ; sureshSkill <- sureshObj.skillSet)
    {
      println(skill)
      println(sureshSkill)
    }
    
    
  }
}