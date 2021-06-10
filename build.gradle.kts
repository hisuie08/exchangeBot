plugins {
    java
    kotlin("jvm") version "1.5.10"
    kotlin("plugin.serialization") version "1.5.0"
    application
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "me.nashiroaoi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://m2.dv8tion.net/releases")
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.1")
    implementation("net.dv8tion:JDA:4.2.1_276")
    implementation("com.jagrosh:jda-utilities:3.0.5")
    implementation ("com.squareup.okhttp3:okhttp:4.4.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

application{
    mainClass.set("${group}.${rootProject.name}.MainKt")
}