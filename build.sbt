name := """LiteratureParser"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test
)
libraryDependencies += "org.sorm-framework" % "sorm" % "0.3.19"

// resolve warning for "Multiple dependencies with the same organization/name"
dependencyOverrides += "org.apache.httpcomponents" % "httpclient" % "4.3.4"
dependencyOverrides += "com.google.guava" % "guava" % "16.0.1"
dependencyOverrides += "org.apache.httpcomponents" % "httpcore" % "4.3.2"
dependencyOverrides += "org.scala-lang.modules" % "scala-parser-combinators_2.11" % "1.0.3"
dependencyOverrides += "org.scala-lang.modules" % "scala-xml_2.11" % "1.0.3"
dependencyOverrides += "org.scala-lang" % "scala-compiler" % "2.11.7"
dependencyOverrides += "org.scala-lang" % "scala-library" % "2.11.6"
dependencyOverrides += "org.scala-lang" % "scala-reflect" % "2.11.6"


resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator