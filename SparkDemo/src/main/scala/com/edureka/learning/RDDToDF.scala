package com.edureka.learning

import org.apache.spark.sql.SparkSession
import org.apache.spark.SparkConf

object RDDToDF {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("Spark-Sql-RDD-TO-DF")
      .setMaster("local[*]")
      .set("spark.submit.deployMode", "client")

    val spark = SparkSession.builder().config(sparkConf).getOrCreate();

    System.setProperty("hadoop.home.dir", "E:\\SAIWS\\Edureka\\Hadoop");

    spark.sparkContext.setLogLevel("ERROR");
    
    val employeeFile = "file:///E:\\SAIWS\\Edureka\\Datasets\\Employee.txt";
    val empRDD = spark.sparkContext.textFile(employeeFile);
    
    import spark.implicits._;
    
    val empDF = empRDD.map(iLine => iLine.split(",")).map(attr => Employee(attr(0),attr(1).toLong)).toDS;
    empDF.show();
    
    empDF.createOrReplaceTempView("employee");
    
    val superiorDF = spark.sql("select name,salary from employee where salary BETWEEN 3500 AND 4000 ");
    superiorDF.show();
    
    superiorDF.map(superior => "Name:"+superior(0)).show()
    superiorDF.map(superior => "Name:"+superior.getAs[String]("name")).show()
    superiorDF.map(superior => "Name:"+superior.getValuesMap[Any](List("name","salary"))).collect.foreach(println)

    
  }
}