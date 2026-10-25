plugins {
    java
}

group = "dev.angelocordon"
// CI passes the release tag (e.g. -Pversion=1.0.0); local builds fall back to "dev".
version = (findProperty("version") as String?)?.takeIf { it != "unspecified" } ?: "dev"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:26.3.build.223-stable")
}

java {
    toolchain.languageVersion = JavaLanguageVersion.of(25)
}

tasks.processResources {
    filesMatching("plugin.yml") {
        expand("version" to project.version)
    }
}

tasks.jar {
    // Fixed name so releases/latest/download/creeper-no-grief.jar always points at the newest build.
    archiveFileName = "creeper-no-grief.jar"
}
