package com.edureka.learning

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SQLContext

object SparkSqlDemo {

  def main(args: Array[String]): Unit = {

    //Create Spark-Conf
    val sparkConf = new SparkConf().setAppName("Spark-Sql-Demo")
                    .setMaster("local[*]")
                    .set("spark.submit.deployMode", "client")
                    
   //Create SparkContext
    
    val sc = new SparkContext(sparkConf);
    
    //Create SqlContext 
    
    val sqlContext = new SQLContext(sc);
    
    //Read a json object
    
    val peopleJson = "file:///E:\\SAIWS\\Edureka\\Datasets\\people.json";
    
    val peopleDF = sqlContext.read.json(peopleJson);
    
    peopleDF.show();
    
    
  }
}