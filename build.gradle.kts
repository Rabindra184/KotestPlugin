plugins {
    kotlin("jvm") version "2.0.0"
}

group = "com.qasecret"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
val kotestVersion: String by project
val opentest4jVersion: String by project
val allureVersion: String by project
val slf4jVersion: String by project

dependencies {

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlin:kotlin-reflect")


    implementation("io.kotest:kotest-framework-api:$kotestVersion") {
        exclude(group = "org.jetbrains.kotlin")
    }
    implementation("io.kotest:kotest-framework-engine-jvm:$kotestVersion") {
        exclude(group = "org.jetbrains.kotlin")
    }
    testImplementation("io.kotest:kotest-property:$kotestVersion")
    testImplementation("io.kotest:kotest-framework-datatest:$kotestVersion")
    testImplementation("io.kotest:kotest-runner-junit5-jvm:$kotestVersion") {
        exclude(group = "org.jetbrains.kotlin")
        exclude(group = "io.mockk")
    }
    implementation("com.epam.reportportal:client-java:5.2.23")
    implementation("org.slf4j:slf4j-api:2.0.16")
    implementation("ch.qos.logback:logback-classic:1.5.15")
    implementation("ch.qos.logback:logback-core:1.5.13")
    implementation("org.testng:testng:7.9.0")
    implementation ("com.epam.reportportal:logger-java-logback:5.2.2")
}


tasks.test {
    useJUnitPlatform()
    systemProperty("kotest.framework.dump.config", "true")
}
kotlin {
    jvmToolchain(17)
}