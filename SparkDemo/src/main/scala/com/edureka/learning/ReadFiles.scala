package com.edureka.learning

import org.apache.spark.sql.SparkSession
import org.apache.spark.SparkConf
import org.apache.spark.sql.SaveMode

object ReadFiles {
    def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("Spark-Sql-RDD-TO-DF")
      .setMaster("local[*]")
      .set("spark.submit.deployMode", "client")

    val spark = SparkSession.builder().config(sparkConf).getOrCreate();

    System.setProperty("hadoop.home.dir", "E:\\SAIWS\\Edureka\\Hadoop");

    spark.sparkContext.setLogLevel("ERROR");
    
    val employeeJson = "file:///E:\\SAIWS\\Edureka\\Datasets\\employees.json";
    
    val employeeOut = "file:///E:\\SAIWS\\Edureka\\Datasets\\PAROUT";
    
    val empDF = spark.read.json(employeeJson)
    empDF.show();
    empDF.write.mode(SaveMode.Overwrite).parquet(employeeOut);  
    
    val parDF = spark.read.parquet(employeeOut);
    parDF.show()
    
     parDF.createOrReplaceTempView("employee");
    
    val superiorDF = spark.sql("select name,salary from employee where salary BETWEEN 3500 AND 4000 ");
    superiorDF.show();
    
    import spark.implicits._;
    
    superiorDF.map(superior => "Name:"+superior(0)).show()
    superiorDF.map(superior => "Name:"+superior.getAs[String]("name")).show()
    superiorDF.map(superior => "Name:"+superior.getValuesMap[Any](List("name","salary"))).collect.foreach(println)

    val empRDD = spark.sparkContext.textFile(employeeJson);
    
    val eRDDToDF = spark.read.json(empRDD);
    eRDDToDF.show()
    
    
    }
}