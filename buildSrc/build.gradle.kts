plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
}

gradlePlugin {
    plugins {
        register("DependencyUpdatePlugin") {
            id = "dependency.update.plugin"
            implementationClass = "codequality.DependencyUpdatePlugin"
        }
    }
}
