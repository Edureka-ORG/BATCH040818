package com.edureka

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SQLContext

object SparkSqlDemo 
{
  def main(args: Array[String]): Unit = 
  {
    
    //Create SparkConf
    import org.apache.spark.SparkConf;
    System.setProperty("hadoop.home.dir", "E:\\SAIWS\\Edureka\\Hadoop");
    val sparkConf = new SparkConf()
                    .setAppName("Spark-Sql-Demo")
                    .setMaster("local[*]")
                    .set("spark.submit.deployMode", "client");
    
    //Create SparkContext
    
    val sc = new SparkContext(sparkConf);
    
    //Create sql Context
    
    val sqlContext = new SQLContext(sc);
    sc.setLogLevel("ERROR");
    

    
    //Input
    
    val peopleJson = "file:///E:\\SAIWS\\Edureka\\Datasets\\people.json";
    
    val pDF = sqlContext.read.json(peopleJson);
    pDF.show()
    pDF.printSchema();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}