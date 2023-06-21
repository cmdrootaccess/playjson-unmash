import Dependencies._

lazy val root = (project in file("."))
  .settings(
    name := "playjson-unmash",
    organization := "dev.rootaccess",
    organizationName := "Root Access",
    homepage := Some(url("https://github.com/cmdrootaccess/playunmash")),
    libraryDependencies ++= Seq(
      akka,
      playJson,
      akkaHttp
    )
  )

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"