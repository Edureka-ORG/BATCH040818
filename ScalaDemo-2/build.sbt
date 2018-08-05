import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.edureka",
      scalaVersion := "2.10.4",
      version      := "1.0-SNAPSHOT"
    )),
    name := "ScalaDemo-2",
    libraryDependencies += scalaTest % Test
  )
