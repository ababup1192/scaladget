import sbt._
import Keys._
import fr.iscpif.jsmanager.JSManagerPlugin._

object ExampleBuild extends Build {
  val Organization = "fr.iscpif"
  val Name = "Scaladget Example"
  val Version = "0.1.0-SNAPSHOT"
  val ScalaVersion = "2.10.4"


  lazy val scaladgetExample= Project("examples",
    file("examples"),
    settings = Defaults.defaultSettings ++ jsManagerSettings ++ Seq(
      libraryDependencies += "fr.iscpif" %% "scaladget" % "0.1.0-SNAPSHOT",
      jsCall := "Accordion().run();"
      //outputPath := "/tmp"
      )
  )
}