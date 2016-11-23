import sbt._

object Dependencies {

  object Compile {
    val nscalaTime = "com.github.nscala-time" %% "nscala-time" % "1.6.0"
    val gatlingTestFramework = "io.gatling" % "test-framework" % "1.0"
    val gatlingHighCharts = "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.1.7"
    val typesafeConfig = "com.typesafe" % "config" % "1.2.0"
    val performanceTestRunner = "uk.gov.hmrc" %% "performance-test-runner" % "1.16.0"
  }
}


