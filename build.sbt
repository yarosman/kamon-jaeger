scalaVersion := "2.13.0"
resolvers += Resolver.mavenLocal
libraryDependencies += "io.jaegertracing" % "jaeger-thrift" % "1.1.0"
libraryDependencies += "io.kamon" %% "kamon-core" % "2.0.0"

crossScalaVersions := Seq("2.11.12", "2.12.7", "2.13.0")
