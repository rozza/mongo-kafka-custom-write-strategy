/*
 * Copyright 2021-present Ross Lawley
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


buildscript {
    repositories {
        mavenCentral()
        jcenter()
    }
}

plugins {
    `java-library`
}


java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    mavenLocal()
    mavenCentral()
    maven(url = "https://oss.sonatype.org/content/repositories/snapshots")
}


dependencies {
    api("org.mongodb:mongodb-driver-sync:[3.11.0,3.12.99)")
    api("org.mongodb.kafka:mongo-kafka-connect:1.3.0")
}

sourceSets {
    main {
        java.srcDir("src/main")
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

