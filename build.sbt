name := "scala-mongodb"

version := "1.0"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "2.0" % "test",
  "com.typesafe" % "scalalogging-slf4j_2.10" % "1.1.0",
  "ch.qos.logback" % "logback-classic" % "1.1.1",
  "org.mongodb" % "mongo-java-driver" % "2.11.3",
  "com.github.fakemongo" % "fongo" % "1.4.0"
)
