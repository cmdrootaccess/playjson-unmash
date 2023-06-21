import sbt._


object Dependencies {
  val AkkaVersion = "2.8.0"
  val akka = "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion
  val playJson = "com.typesafe.play" %% "play-json" % AkkaVersion
  val akkaHttp = "com.typesafe.akka" %% "akka-http" % "10.5.2"
}
