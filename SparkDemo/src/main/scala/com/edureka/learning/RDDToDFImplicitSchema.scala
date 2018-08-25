package com.edureka.learning

import org.apache.spark.sql.SparkSession
import org.apache.spark.SparkConf
import org.apache.spark.sql.types.StructField
import org.apache.spark.sql.types.StringType
import org.apache.spark.sql.types.StructType
import org.apache.spark.sql.Row

object RDDToDFImplicitSchema {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("Spark-Sql-RDD-TO-DF")
      .setMaster("local[*]")
      .set("spark.submit.deployMode", "client")

    val spark = SparkSession.builder().config(sparkConf).getOrCreate();

    System.setProperty("hadoop.home.dir", "E:\\SAIWS\\Edureka\\Hadoop");

    spark.sparkContext.setLogLevel("ERROR");
    
    val employeeFile = "file:///E:\\SAIWS\\Edureka\\Datasets\\Employee.txt";
    val empRDD = spark.sparkContext.textFile(employeeFile);
    
    
    val schemaString = "name salary";
    
    val fields = schemaString.split(" ").map(fieldName => StructField(fieldName,StringType,nullable=true))
    
    val schema = StructType(fields);
    
    val rowRDD = empRDD.map(iLine => iLine.split(",")).map(att => Row(att(0),att(1).trim()));
    
    val empDF = spark.createDataFrame(rowRDD,schema);
    
     empDF.createOrReplaceTempView("employee");
    
    val superiorDF = spark.sql("select name,salary from employee where salary BETWEEN 3500 AND 4000 ");
    superiorDF.show();
    
    import spark.implicits._;
    
    superiorDF.map(superior => "Name:"+superior(0)).show()
    superiorDF.map(superior => "Name:"+superior.getAs[String]("name")).show()
    superiorDF.map(superior => "Name:"+superior.getValuesMap[Any](List("name","salary"))).collect.foreach(println)

  }
}