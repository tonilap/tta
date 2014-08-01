organization := "com.toni"

name := "mmt"

version := "0.1.0"

scalaVersion := "2.11.0"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")

unmanagedResourceDirectories in Compile <++= baseDirectory { base =>
    Seq( base / "src/main/webapp" )
}

resolvers ++= Seq(
  "sonatype releases" at "https://oss.sonatype.org/content/repositories/releases/",
  "sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "typesafe repo" at "http://repo.typesafe.com/typesafe/releases/",
  "spray repo" at "http://repo.spray.io/"
)

libraryDependencies ++= Seq(
   "io.spray" %% "spray-json" % "1.2.6"
  ,"io.spray" %% "spray-can" % "1.3.1-20140423"
  ,"io.spray" %% "spray-routing" % "1.3.1-20140423"
  ,"io.spray" %% "spray-testkit" % "1.3.1-20140423"
  ,"com.typesafe.akka" %% "akka-actor" % "2.3.2"
  ,"junit" % "junit" % "4.8.1" % "test"
  ,"org.scalatest" % "scalatest_2.11" % "2.1.5"
)
