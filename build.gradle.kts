plugins {
    kotlin("jvm") version "2.2.0"
    application                   // ✅ Add this
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(23)
}

// ✅ Set the main class for the application plugin
application {
    mainClass.set("MainKt") // Replace MainKt with the name of your main file if different
}
