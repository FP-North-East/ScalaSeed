val scalaTest = "org.scalatest" %% "scalatest" % "latest.integration" % Test
val scalaCheck = "org.scalacheck" %% "scalacheck" % "latest.integration" % Test

lazy val commonSettings = Seq(
  organization := "com.meetup.fpne",
  version := "0.1.0",
  scalaVersion := "2.11.7"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "FPNE Scala seed project",
    libraryDependencies ++= Seq(scalaTest, scalaCheck)
  )