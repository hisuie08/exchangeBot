plugins {
    java
    kotlin("jvm") version "1.5.10"
    kotlin("plugin.serialization") version "1.5.0"
}

group = "me.nashiroaoi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://m2.dv8tion.net/releases")
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.1")
    implementation("net.dv8tion:JDA:4.2.1_276")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}