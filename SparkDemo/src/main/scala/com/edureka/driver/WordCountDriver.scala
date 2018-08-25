package com.edureka.driver

import org.apache.spark.{SparkConf,SparkContext}

object WordCountDriver {
  
  def main(args: Array[String]): Unit = {
    
    //Step-1 : Create SparkContext 
    
    //Step-1 : a : We need SparkConf
    
    val sparkConf = new SparkConf();
    
    sparkConf.setAppName("Spark-Demo");
    sparkConf.setMaster("local");
    sparkConf.set("spark.submit.deployMode","client");
    sparkConf.set("spark.app.name","Spark-Demo");
    sparkConf.set("spark.master","local");
    
    
    val sc = new SparkContext(sparkConf);
    
    
    
  }
  
}