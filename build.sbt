name := "bigBob"

version := "1.0-SNAPSHOT"

libraryDependencies += "postgresql" % "postgresql" % "9.1-901-1.jdbc4"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings
