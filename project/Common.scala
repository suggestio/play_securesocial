import sbt._
import Keys._

object Common {
  def version = "master-SNAPSHOT"  
  def playVersion = System.getProperty("play.version", "2.4.0-M2")
  def scalaVersion =  System.getProperty("scala.version", "2.11.4")
}
