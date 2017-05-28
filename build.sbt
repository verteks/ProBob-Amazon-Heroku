name := "bigbob"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)

libraryDependencies += "postgresql" % "postgresql" % "9.1-901-1.jdbc4"

libraryDependencies += "com.amazonaws" % "aws-java-sdk" % "1.11.109"

play.Project.playJavaSettings
