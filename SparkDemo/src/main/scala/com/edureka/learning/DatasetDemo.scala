package com.edureka.learning

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object DatasetDemo {
  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf().setAppName("Spark-Sql-Demo")
      .setMaster("local[*]")
      .set("spark.submit.deployMode", "client")

    val spark = SparkSession.builder().config(sparkConf).getOrCreate();

    System.setProperty("hadoop.home.dir", "E:\\SAIWS\\Edureka\\Hadoop");

    spark.sparkContext.setLogLevel("ERROR");
    
    import spark.implicits._;
    val employees = Seq(new Employee("AAA",20));
    val eDS=spark.createDataset(employees);
    
    eDS.show();
    
    val pDS = Seq( 1,2,3).toDS;
    
    pDS.map(_ + 1).collect.foreach(println)
    
    
    val employeeJson = "file:///E:\\SAIWS\\Edureka\\Datasets\\employees.json";
    
    val empDS = spark.read.json(employeeJson).as[Employee]
    
    empDS.show();
    
//    spark.sparkContext.parallelize(empDS.collect,1).saveAsTextFile("file:///E:\\SAIWS\\Edureka\\Datasets\\EMPOP");
    

  }
}

case class Employee(name:String, salary:Long);