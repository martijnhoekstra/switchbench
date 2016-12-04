name := """matchbenchmarks"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.0"

libraryDependencies ++= Seq(
  // Add your own project dependencies in the form:
  // "group" % "artifact" % "version"
)

enablePlugins(JmhPlugin)

incOptions := incOptions.value.withNameHashing(false)
