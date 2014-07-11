name := "rapture-test"

organization := "radius"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.1"

resolvers ++= Seq("cloudera" at "https://repository.cloudera.com/artifactory/cloudera-repos/")

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.3.12" % "test",
  "org.scalatest" %% "scalatest" % "2.2.0" % "test",
  "com.propensive" %% "rapture-io" % "0.9.1" withSources() withJavadoc(),
  "com.propensive" %% "rapture-json" % "0.9.1" withSources() withJavadoc(),
  "com.propensive" %% "rapture-json-jackson" % "0.9.0" withSources() withJavadoc(),
  "com.propensive" %% "rapture-core" % "0.9.0" withSources() withJavadoc(),
  "com.propensive" %% "rapture-test" % "0.9.1" withSources() withJavadoc(),
  "com.propensive" %% "rapture-net" % "0.9.0" withSources() withJavadoc(),
  "com.propensive" %% "rapture-uri" % "0.9.1" withSources() withJavadoc()
)
