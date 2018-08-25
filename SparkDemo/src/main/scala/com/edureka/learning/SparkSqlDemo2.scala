package com.edureka.learning

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.SparkSession

object SparkSqlDemo2 {

  def main(args: Array[String]): Unit = {

    //Create Spark-Conf
    val sparkConf = new SparkConf().setAppName("Spark-Sql-Demo")
                    .setMaster("local[*]")
                    .set("spark.submit.deployMode", "client")
                    
   //Create SparkSession
                    
    val spark = SparkSession.builder().config(sparkConf).getOrCreate();                
    
    System.setProperty("hadoop.home.dir", "E:\\SAIWS\\Edureka\\Hadoop");

    spark.sparkContext.setLogLevel("ERROR");
//    val sc = new SparkContext(sparkConf);
//    
//    //Create SqlContext 
//    
//    val sqlContext = new SQLContext(sc);
//    
    //Read a json object
    
    val peopleJson = "file:///E:\\SAIWS\\Edureka\\Datasets\\people.json";
    
    val df = spark.read.json(peopleJson);
    
    df.show();
    
    df.printSchema();
    
    df.select("name").show
    
    import spark.implicits._;
    
    df.select ($"name",$"age"+1).show
    
    df.select($"age" > 21).show()
    
    df.groupBy("age").count().show()
    
    df.createOrReplaceTempView("people");
    
    val peopleDF = spark.sql("select * from people");
    
    peopleDF.show()
    
    spark.close();
    
    
  }
}