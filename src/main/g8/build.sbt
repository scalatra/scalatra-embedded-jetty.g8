organization := "$organization$"

name := "$name$"

version := "$version$"

scalaVersion := "$scala_version$"

classpathTypes ~= (_ + "orbit")

libraryDependencies ++= Seq(
  "org.scalatra" % "scalatra" % "2.1.0-RC3",
  "org.scalatra" % "scalatra-scalate" % "2.1.0-RC3",
  "org.scalatra" % "scalatra-specs2" % "2.1.0-RC3" % "test",
  "ch.qos.logback" % "logback-classic" % "1.0.6" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.5.v20120716" % "compile",
  "org.eclipse.jetty" % "test-jetty-servlet" % "8.1.5.v20120716" % "test",
  "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "compile;provided;test" artifacts (Artifact("javax.servlet", "jar", "jar"))
)
