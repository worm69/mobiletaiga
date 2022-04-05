// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        mavenCentral()
        google()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
    dependencies {
        classpath("com.google.gms:google-services:${Constants.google_services}")
        classpath("com.android.tools.build:gradle:${Constants.gradle_version}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Constants.kotlin_version}")
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:${Constants.dokka_version}")
        classpath("com.apollographql.apollo:apollo-gradle-plugin:${Constants.apollo_version}")
        classpath("io.realm:realm-gradle-plugin:${Constants.realm_version}")
//dont suport gradle 6
//        classpath "com.dicedmelon.gradle:jacoco-android:$jacoco_android_version"
        classpath("com.hiya:jacoco-android:0.2")
        classpath("org.sonarsource.scanner.gradle:sonarqube-gradle-plugin:${Constants.sonarqube_version}")
        // Add dependency
        classpath("com.google.firebase:firebase-crashlytics-gradle:${Constants.firebase_crashlytics}")


        //check dependencies
        classpath("com.netflix.nebula:gradle-lint-plugin:17.6.1")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}


allprojects {
    //FIXME nebula
//    apply(plugin = "nebula.lint")
////    gradleLint.rules += "unused-dependency"
////    gradleLint.rules = ["all-dependency"] // add as many rules here as you"d like
//    gradleLint {
//        rules=['unused-dependency']
//        reportFormat = 'text'
//    }
    repositories {
        mavenCentral()
        google()
        maven { url = uri("https://plugins.gradle.org/m2/") }
        maven { url = uri("https://maven.google.com") }
        maven { url = uri("https://jitpack.io") }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
// TODO: fix sonar
//apply plugin: "org.sonarqube"
//plugins {
//    id("org.sonarqube")
//}
//sonarqube {
//    androidVariant "debug"
//
//    properties {
//        property "sonar.sourceEncoding", "UTF-8"
//        property "sonar.verbose", true
//        property "sonar.host.url", "http://192.168.99.100:9000"
//
//        property "sonar.projectName", "Mobile Taiga"
//        property "sonar.projectKey", "mobile-taiga"
//        property "sonar.sourceEncoding", "UTF-8"
//        property "sonar.projectVersion", "0.1"
//        property "sonar.issuesReport.html.enable", "true"
//        property "sonar.issuesReport.console.enable", "true"
//
//        property "sonar.coverage.jacoco.xmlReportPaths", findAllReports()
//        property "detekt.sonar.kotlin.config.path", "${rootProject.projectDir}/detekt-config.yml"
//        property "sonar.scm.provider", "git"
//        property "sonar.login","c778a2de6a5124cad4c6cef87063c5b0e5b3c551"
//        property "sonar.java.coveragePlugin", "jacoco"
//    }
//}
//
//String findAllReports() {
//    def file = "${rootProject.buildDir}/reports"
//
//    def sonarEnabledProjects = rootProject.subprojects
//            .findAll { p -> p.sonarqube.getProperties().get("skipProject") == false }
//            *.name
//            .collect { projectName -> "$file/jacocoTestReport-${projectName}.xml" }
//            .join(",")
//
//    return sonarEnabledProjects
//}
