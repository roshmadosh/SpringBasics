plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    java
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

    // https://mvnrepository.com/artifact/org.springframework/spring-core
    implementation("org.springframework:spring-context:5.3.24")

}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}

task("xml", JavaExec::class) {
    group = "runnables"
    main = "link/hiroshisprojects/springbasics/xml/XmlMain"
    classpath = sourceSets["main"].runtimeClasspath
}
