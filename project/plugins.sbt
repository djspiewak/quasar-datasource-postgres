resolvers += Resolver.sonatypeRepo("releases")
resolvers += Resolver.bintrayRepo("slamdata-inc", "maven-public")

addSbtPlugin("io.get-coursier" % "sbt-coursier" % "2.0.0-RC3-1")
addSbtPlugin("com.slamdata" % "sbt-slamdata" % "5.1.4")
addSbtPlugin("com.slamdata" % "sbt-quasar-plugin" % "0.2.2")
