import tanvd.kosogor.proxy.publishJar
import tanvd.kosogor.proxy.publishPlugin

group = "tanvd.kosogor"
version = "1.0.16-SNAPSHOT"

dependencies {
    compileOnly(gradleKotlinDsl())
    compileOnly(gradleApi())

    api("org.jfrog.buildinfo", "build-info-extractor-gradle", "4.24.4")
    api("com.github.jengelman.gradle.plugins", "shadow", "5.2.0")
    api("com.gradle.publish", "plugin-publish-plugin", "0.12.0")
}

publishJar {
    publication {
        artifactId = "tanvd.kosogor.gradle.plugin"
    }
}

publishPlugin {
    id = "tanvd.kosogor"
    displayName = "kosogor"
    implementationClass = "tanvd.kosogor.KosogorPlugin"
    version = project.version.toString()

    info {
        website = "https://github.com/TanVD/kosogor"
        vcsUrl = "https://github.com/TanVD/kosogor"
        description = "Reasonable defaults and simplified Kotlin-DSL interfaces for everyday development"
        tags.addAll(listOf("default", "common", "kotlin", "jar", "shadowjar", "artifactory", "idea"))
    }
}
