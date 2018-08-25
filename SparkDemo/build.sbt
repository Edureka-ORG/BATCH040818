import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.edureka",
      scalaVersion := "2.11.8",
      version      := "1.0.0-SNAPSHOT"
    )),
    name := "SparkDemo",
    libraryDependencies += scalaTest % Test
  )
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.1.0"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.1.0"