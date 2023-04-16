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
        classpath("com.android.tools.build:gradle:8.0.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Constants.kotlin_version}")
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:${Constants.dokka_version}")
        classpath("com.apollographql.apollo:apollo-gradle-plugin:${Constants.apollo_version}")
        classpath("io.realm:realm-gradle-plugin:${Constants.realm_version}")
        classpath("com.hiya:jacoco-android:0.2")
        classpath("org.sonarsource.scanner.gradle:sonarqube-gradle-plugin:${Constants.sonarqube_version}")
        classpath("com.google.firebase:firebase-crashlytics-gradle:${Constants.firebase_crashlytics}")

        //check dependencies
        classpath("com.netflix.nebula:gradle-lint-plugin:17.6.1")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}


allprojects {
    //FIXME nebula
    //Gradle Lint Plugin currently doesn't support kotlin build scripts. Please, switch to groovy build script if you want to use linting.
//    apply(plugin = "nebula.lint")
//    gradleLint.rules += "unused-dependency"
//    gradleLint.rules = ["all-dependency"] // add as many rules here as you"d like

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


plugins {
    java
    id("org.sonarqube") version "3.3"
}

sonarqube {
    properties {
        // See https://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner+for+Gradle#AnalyzingwithSonarQubeScannerforGradle-Configureanalysisproperties
        property("sonar.sourceEncoding", "UTF-8")
        val projectName = "Mobile Taiga"
        property("sonar.projectName", projectName)
        property("sonar.projectKey", System.getenv()["SONAR_PROJECT_KEY"] ?: projectName)
        property("sonar.projectVersion", project.version.toString())
        property("sonar.host.url", System.getenv()["SONAR_HOST_URL"] ?: "http://localhost:9000")
        property("sonar.login", System.getenv()["SONAR_LOGIN"] ?: "")
//        property("sonar.password", System.getenv()["SONAR_PASSWORD"] ?: "")
        property("sonar.verbose", System.getenv()["SONAR_VERBOSE"] ?: false)

        property("sonar.issuesReport.html.enable", true)
        property("sonar.issuesReport.console.enable", true)

        property("sonar.coverage.jacoco.xmlReportPaths", findAllReports())
        property("detekt.sonar.kotlin.config.path", "${rootProject.projectDir}/detekt-config.yml")
        property("sonar.scm.provider", "git")
        property("sonar.java.coveragePlugin", "jacoco")
    }
}

fun findAllReports() : String {
    val file = "${rootProject.buildDir}/reports"
    var sonarEnabledProjects = ""
    rootProject.subprojects
        .forEach {p->sonarEnabledProjects+="$file/jacocoTestReport-${p.name}.xml" }

    return sonarEnabledProjects
}
