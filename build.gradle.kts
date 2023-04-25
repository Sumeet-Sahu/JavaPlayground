plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.projectlombok:lombok:1.18.20")
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("commons-codec:commons-codec:1.15")
//    implementation("org.springframework.boot:spring-boot-starter-web")
//    implementation("org.springframework:spring-core:5.3.14")
//    implementation("org.springframework:spring-context:5.3.14")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

//tasks.test {
//    useJUnitPlatform()
//}