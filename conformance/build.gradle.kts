plugins {
    `version-catalog`

    java
    alias(libs.plugins.errorprone.plugin)
}

// Disable javadoc for conformance tests
tasks.withType<Javadoc> {
    enabled = false
}

tasks {
    jar {
        manifest {
            attributes(mapOf("Main-Class" to "build.buf.Main"))
        }
        duplicatesStrategy = DuplicatesStrategy.INCLUDE
        // This line of code recursively collects and copies all of a project's files
        // and adds them to the JAR itself. One can extend this task, to skip certain
        // files or particular types at will
        val sourcesMain = sourceSets.main.get()
        val contents = configurations.runtimeClasspath.get()
            .map { if (it.isDirectory) it else zipTree(it) } +
                sourcesMain.output
        from(contents)
    }
}

dependencies {
    implementation(project(":"))
    implementation(libs.guava)
    implementation(libs.protobuf.java)
    implementation(libs.protovalidate)
    implementation(libs.protovalidate.testing)
    implementation(libs.grpc.netty)
    implementation("build.buf.gen:bufbuild_protovalidate-testing_grpc_java:1.56.1.1.00000000000000.79e519aab9ca")

    testImplementation(libs.assertj)
    testImplementation(libs.junit)
    testImplementation(libs.protovalidate.testing)

    errorprone(libs.errorprone)
}