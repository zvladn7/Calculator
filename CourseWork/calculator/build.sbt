name := "calculator"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies += "org.scalafx" %% "scalafx" % "12.0.2-R18"

val javafxModules = Seq("base", "controls", "fxml", "graphics", "media", "swing", "web")
val osName = System.getProperty("os.name") match {
  case n if n.startsWith("Linux") => "linux"
  case n if n.startsWith("Mac") => "mac"
  case n if n.startsWith("Windows") => "win"
  case _ => throw new Exception("Unknown platform!")
}
libraryDependencies ++= javafxModules.map(m => "org.openjfx" % s"javafx-$m" % "12.0.2" classifier osName)
libraryDependencies += "org.scala-lang.modules" %% "scala-swing" % "2.1.1"
libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.2.0"

scalacOptions += "-Ymacro-annotations"

libraryDependencies += "org.scalafx" %% "scalafxml-core-sfx8" % "0.5"


fork := true