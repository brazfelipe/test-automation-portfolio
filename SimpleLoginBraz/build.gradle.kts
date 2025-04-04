plugins {
    id("java")
}

group = "com.braz"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.29.0")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.12.0")
}

tasks.test {
    useJUnitPlatform()
}