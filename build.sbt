name := "kafka-example"

version := "1.0"

scalaVersion := "2.12.0"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"


libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.2"

libraryDependencies += "com.typesafe.akka" %% "akka-remote" % "2.5.2"

libraryDependencies += "org.apache.kafka" % "kafka-clients" % "0.10.2.1"

libraryDependencies += "org.apache.kafka" %% "kafka" % "0.10.2.1"

