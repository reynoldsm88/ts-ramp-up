import sbt._

object Dependencies {

    val slf4jVersion = "1.7.20"
    val logbackVersion = "1.2.3"
    val scalaTestVersion = "3.0.5"
    val scalatraVersion = "2.5.4"
    val jettyWebappVersion = "9.4.18.v20190429"
    val servletApiVersion = "3.1.0"


    val slf4j = Seq( "org.slf4j" % "slf4j-api" % slf4jVersion )

    val logback = Seq( "ch.qos.logback" % "logback-classic" % logbackVersion )

    val scalatra = Seq( "org.scalatra" %% "scalatra" % scalatraVersion,
                        "org.scalatra" %% "scalatra-scalatest" % scalatraVersion % "test",
                        "org.eclipse.jetty" % "jetty-webapp" % jettyWebappVersion,
                        "javax.servlet" % "javax.servlet-api" % servletApiVersion )

    val scalaTest = Seq( "org.scalatest" %% "scalatest" % scalaTestVersion % "test" )
}
