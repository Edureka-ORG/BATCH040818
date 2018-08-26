package com.edureka

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.SparkSession

object SparkSqlDemo2 
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
    
    //Create SparkSession
    
    val spark = SparkSession.builder().config(sparkConf).getOrCreate();

    spark.sparkContext.setLogLevel("ERROR");
    
    //Input
    
    val peopleJson = "file:///E:\\SAIWS\\Edureka\\Datasets\\people.json";
    
    val pDF = spark.read.json(peopleJson);
    pDF.show()
    pDF.printSchema();
    
    //select name from people
    
    pDF.select("name").show()
    
    import spark.implicits._;
    
    pDF.select($"name",$"age"+1).show
    
    pDF.filter($"age" > 21).show();
    
    pDF.groupBy("age").count.show();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}