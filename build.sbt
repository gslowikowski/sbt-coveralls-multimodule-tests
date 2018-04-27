val commonSettings = Seq(
  organization := "com.github.gslowikowski.tests.disabling-scoverage-plugin.multi-module",
  version := "1.0.0-SNAPSHOT",
  scalaVersion := "2.12.4",
  crossScalaVersions := Seq("2.10.7", "2.11.12", "2.12.4")
)

val moduleSettings = Seq(
  coverageMinimum := 80,
  coverageFailOnMinimum := true,
  libraryDependencies += "org.specs2" %% "specs2" % "2.5" % "test"
)

val module1 = (project in file("module1"))
  .settings(commonSettings: _*)
  .settings(moduleSettings: _*)
  .settings(
    name := "module1"
  )

val module2 = (project in file("module2"))
  .settings(commonSettings: _*)
  .settings(moduleSettings: _*)
  .settings(
    name := "module2"
  )

val root = (project in file("."))
  .settings(commonSettings: _*)
  .settings(
    name := "root",
    publishArtifact := false
  )
  .aggregate(module1, module2)
