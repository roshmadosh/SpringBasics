plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

java {
	toolchain {
		languageVersion.set(JavaLanguageVersion.of(8))
	}
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter for testing.
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
}

application {
    // Define the main class for the application.
    mainClass.set("link.hiroshisprojects.springbasics.App")
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
