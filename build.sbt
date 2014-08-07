import com.typesafe.sbt.SbtStartScript

seq(SbtStartScript.startScriptForClassesSettings: _*)

organization := "com.toni"

name := "tta"

version := "1.0"

scalaVersion := "2.9.2"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
	"com.twitter" % "finagle-core" % "1.9.0", 
	"com.twitter" % "finagle-http" % "1.9.0",
	"org.mongodb" %% "casbah" % "2.5.0",
	"com.novus" %% "salat-core" % "1.9.5"
	)

resolvers += Classpaths.typesafeResolver

