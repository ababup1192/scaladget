import scala.scalajs.sbtplugin.ScalaJSPlugin._

scalaJSSettings

organization := "fr.iscpif"

name := "jsManager"

version := "0.7.0-SNAPSHOT"

scalaVersion := "2.10.4"

sbtPlugin := true

libraryDependencies ++= Seq("com.github.scala-incubator.io" %% "scala-io-core" % "0.4.3")

addSbtPlugin("org.scala-lang.modules.scalajs" % "scalajs-sbt-plugin" % "0.5.5")

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (version.value.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomIncludeRepository := { _ => false}

licenses := Seq("Affero GPLv3" -> url("http://www.gnu.org/licenses/"))

homepage := Some(url("https://github.com/mathieuleclaire/scaladget"))

scmInfo := Some(ScmInfo(url("https://github.com/mathieuleclaire/scaladget.git"), "scm:git:git@github.com:mathieuleclaire/scaladget.git"))

pomExtra := {
  <developers>
    <developer>
      <id>mathieuleclaire</id>
      <name>Mathieu Leclaire</name>
      <url>https://github.com/mathieuleclaire/</url>
    </developer>
  </developers>
}
