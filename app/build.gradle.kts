plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    id("java")
    id("eclipse")
    id("idea")
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
    implementation("com.google.guava:guava:31.1-jre")
    implementation("org.apache.commons:commons-lang3:3.11")
}

application {
    // Define the main class for the application.
    mainClass.set("bank.account.App")
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
