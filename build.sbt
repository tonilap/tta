organization := "com.toni"

name := "mmt"

version := "0.1.0"

scalaVersion := "2.11.0"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")

resolvers ++= Seq(
  "sonatype releases" at "https://oss.sonatype.org/content/repositories/releases/",
  "sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "typesafe repo" at "http://repo.typesafe.com/typesafe/releases/",
  "spray repo" at "http://repo.spray.io/"
)

libraryDependencies ++= {
  val sprayVersion = "1.3.1"
  val akkaVersion = "2.3.4"
  Seq(
  "io.spray" % "spray-can" % sprayVersion,
  "io.spray" % "spray-routing" % sprayVersion,
  "io.spray" % "spray-testkit" % sprayVersion,
  "io.spray" % "spray-client" % sprayVersion,
  "io.spray" %% "spray-json" % "1.2.6",
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
  "ch.qos.logback" % "logback-classic" % "1.1.2",
  "org.scalatest" %% "scalatest" % "2.1.5" % "test",
  "org.specs2" %% "specs2" % "2.3.11" % "test",
  "junit" % "junit" % "4.8.1" % "test"
  )
}

