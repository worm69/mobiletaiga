import java.util.Properties
import java.io.File
import java.io.FileInputStream
import java.util.*
import com.google.firebase.appdistribution.gradle.AppDistributionExtension

import com.android.build.gradle.internal.dsl.BaseFlavor
import com.android.build.gradle.internal.dsl.DefaultConfig

plugins {
    id("com.android.application")
    kotlin("android")
//    kotlin("android.extensions")
    id("kotlin-parcelize")
    kotlin("kapt")
    id("org.jetbrains.dokka")
    id("com.apollographql.apollo")
    id("com.google.firebase.crashlytics")
    id("realm-android")
//    from("../jacoco.gradle")
//    from("../sonar.gradle")
//    id("com.google.firebase.appdistribution")
    id("com.google.gms.google-services")
}
apply(plugin = "com.google.firebase.appdistribution")
//apply plugin: "com.android.application"
//apply plugin: "kotlin-android"
//apply plugin: "kotlin-parcelize"
//apply plugin: "kotlin-kapt"
//apply plugin: "org.jetbrains.dokka"
//apply plugin: "com.apollographql.apollo"
//apply plugin: "com.google.firebase.crashlytics"
//apply plugin: "realm-android"
////apply plugin: "jacoco-android"
//apply from: "../jacoco.gradle"
//apply from: "../sonar.gradle"
//apply plugin: "com.google.firebase.appdistribution"


android {
    compileSdkVersion (32)
    buildToolsVersion ("32.0.0")
    signingConfigs {
        if (rootProject.file("keystore.properties").exists()) {
            val signingDebug = Properties()
            signingDebug.load(FileInputStream(rootProject.file("keystore.properties")))
            getByName("debug") {
                storeFile = rootProject.file(signingDebug.getProperty("storeFile"))
                storePassword = signingDebug.getProperty("storePassword")
                keyAlias = signingDebug.getProperty("keyAlias")
                keyPassword = signingDebug.getProperty("keyPassword")
            }
        }
        if (rootProject.file("keystore.properties").exists()) {
            val signingRelease = Properties()
            signingRelease.load(FileInputStream(rootProject.file("keystore.properties")))
            create("release") {
                storeFile =  rootProject.file(signingRelease.getProperty("storeFile"))
                storePassword = signingRelease.getProperty("storePassword")
                keyAlias = signingRelease.getProperty("keyAlias")
                keyPassword = signingRelease.getProperty("keyPassword")
            }
        }
    }

    defaultConfig {
        applicationId ="pt.dbmg.mobiletaiga"
        namespace = "pt.dbmg.mobiletaiga"
        minSdkVersion (21)
        targetSdkVersion (32)
        versionCode =1
        versionName ="0.1.1"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
        multiDexEnabled = true


        buildConfigField("String", "TOKEN", project.properties["WhatAnimeToken"] as String)
        buildConfigField("String", "SERVER_DOMAIN", project.properties["WhatAnimeDomain"] as String)
        buildConfigField("String", "ANILISTCALLBACKURL", project.properties["AnilistCallbackURL"] as String)
        buildConfigField("String", "ANILISTAUTHURL", project.properties["AnilistAuthURL"] as String)
        buildConfigField("String", "ANILISTACCESSTOKENURL", project.properties["AnilistAccessTokenURL"] as String)
        buildConfigField("String", "ANILISTCLIENTID", project.properties["AnilistClientId"] as String)
        buildConfigField("String", "ANILISTCLIENTSECRET", project.properties["AnilistClientSecret"] as String)

//        buildConfigFieldFromGradleProperty("TOKEN", "WhatAnimeToken")
//        buildConfigFieldFromGradleProperty("SERVER_DOMAIN", "WhatAnimeDomain")
//        buildConfigFieldFromGradleProperty( "ANILISTCALLBACKURL", "AnilistCallbackURL")
//        buildConfigFieldFromGradleProperty( "ANILISTAUTHURL", "AnilistAuthURL")
//        buildConfigFieldFromGradleProperty( "ANILISTACCESSTOKENURL", "AnilistAccessTokenURL")
//        buildConfigFieldFromGradleProperty( "ANILISTCLIENTID", "AnilistClientId")
//        buildConfigFieldFromGradleProperty( "ANILISTCLIENTSECRET", "AnilistClientSecret")
        buildConfigField("String", "KITSUURL", project.properties["KitsuURL"] as String)
        buildConfigField("String", "KITSUCLIENTID", project.properties["KitsuClientId"] as String)
        buildConfigField("String", "KITSUCLIENTSECRET", project.properties["KitsuClientSecret"] as String)

//        buildConfigFieldFromGradleProperty("KITSUURL", "KitsuURL")
//        buildConfigFieldFromGradleProperty("KITSUCLIENTID", "KitsuClientId")
//        buildConfigFieldFromGradleProperty( "KITSUCLIENTSECRET", "KitsuClientSecret")

    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }


    buildTypes {
        release {
            proguardFiles (getDefaultProguardFile ("proguard-android.txt"), "proguard-rules.pro")
//            it.buildConfigField ("Boolean", "IS_LOGGER_ENABLED", ReleaseIsLoggerEnabled)
//            firebaseAppDistribution { //BUG https://stackoverflow.com/questions/60968795/android-kotlin-dsl-unresolved-reference-firebaseappdistribution
////                releaseNotesFile="/path/to/releasenotes.txt"
//                testers = "gomesdanielbm@gmail.com"
//            }
            configure<AppDistributionExtension> {
                releaseNotesFile = "/path/to/releasenotes.txt"
                testers = "gomesdanielbm@gmail.com"
            }
            signingConfig = signingConfigs.getByName("release")
        }
        debug {
            //use resConfig("en", "xxhdpi") Including Minimal Resources
            //disable this build id for development build.
//            ext.alwaysUpdateBuildId = false
            isMinifyEnabled = false
//            it.buildConfigField ("Boolean", "IS_LOGGER_ENABLED", DebugIsLoggerEnabled)
            signingConfig = signingConfigs.getByName("debug")
        }

    }
//    buildTypes.each {
//        it.buildConfigField ("String", "TOKEN", WhatAnimeToken)
//        it.buildConfigField ("String", "SERVER_DOMAIN", WhatAnimeDomain)
//        it.buildConfigField ("String", "ANILISTCALLBACKURL", AnilistCallbackURL)
//        it.buildConfigField ("String", "ANILISTAUTHURL", AnilistAuthURL)
//        it.buildConfigField ("String", "ANILISTACCESSTOKENURL", AnilistAccessTokenURL)
//        it.buildConfigField ("String", "ANILISTCLIENTID", AnilistClientId)
//        it.buildConfigField ("String", "ANILISTCLIENTSECRET", AnilistClientSecret)
//
//        it.buildConfigField ("String", "KITSUURL", KitsuURL)
//        it.buildConfigField ("String", "KITSUCLIENTID", KitsuClientId)
//        it.buildConfigField ("String", "KITSUCLIENTSECRET", KitsuClientSecret)
//
//
//    }
//    sourceSets {
//        main.java.srcDirs += "src/main/java"
//    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "11"
    }
    lint {
        abortOnError =false
    }
//    namespace "pt.dbmg.mobiletaiga"

//    plugins {
//        id("com.apollographql.apollo").version("2.3.1")
//    }
}

buildscript {
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        classpath("com.google.firebase:firebase-appdistribution-gradle:3.0.1")
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))


    // add the Firebase SDK for Google Analytics
    implementation("com.google.firebase:firebase-analytics:20.1.2")
    implementation("com.google.firebase:firebase-crashlytics:18.2.9")

    //Support library

    implementation("androidx.multidex:multidex:${Constants.multidex_version}")

    implementation("androidx.appcompat:appcompat:${Constants.android_support_library}")
    implementation("androidx.preference:preference-ktx:1.2.0")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("androidx.percentlayout:percentlayout:1.0.0")
    implementation("androidx.recyclerview:recyclerview:1.2.1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:{$Constants.kotlin_version}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:{$Constants.kotlin_version}")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.appcompat:appcompat:${Constants.app_compat}")
    implementation("com.google.android.material:material:1.5.0")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.9.0")
    implementation("io.reactivex.rxjava2:rxandroid:2.1.1")
    implementation("com.jakewharton.timber:timber:5.0.1")
    //noinspection GradleDependency
    implementation("androidx.room:room-runtime:${Constants.room_version}")
    //noinspection GradleDependency
    implementation("androidx.room:room-rxjava2:${Constants.room_version}")
    implementation(project(mapOf("path" to ":anilistclient")))
    kapt("androidx.room:room-compiler:${Constants.room_version}")
    implementation("androidx.paging:paging-runtime-ktx:${Constants.paging_version}")

    // use -ktx for Kotlin
    implementation("com.apollographql.apollo:apollo-runtime:${Constants.apollo_version}")
    implementation("com.apollographql.apollo:apollo-android-support:${Constants.apollo_version}")

    //uses jetbrains annotations, so you will need to include this as a compile time dependency
    implementation("org.jetbrains:annotations:23.0.0")
    compileOnly("org.jetbrains:annotations:23.0.0")
    testCompileOnly("org.jetbrains:annotations:23.0.0")

    implementation("io.realm:android-adapters:3.0.0")
    implementation("android.arch.navigation:navigation-fragment-ktx:${Constants.nav_version}")
    // use -ktx for Kotlin
    implementation("android.arch.navigation:navigation-ui-ktx:${Constants.nav_version}")

    // use -ktx for Kotlin
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:${Constants.lifecycle_version}")
    implementation("androidx.concurrent:concurrent-futures:${Constants.futures_version}")

    // ViewModel and LiveData
//    The APIs in lifecycle-extensions have been deprecated. Instead, add dependencies for the specific Lifecycle artifacts you need.
//    implementation("androidx.lifecycle:lifecycle-extensions:${Constants.lifecycle_ext_version}")
    //https://developer.android.com/jetpack/androidx/releases/lifecycle
    implementation("androidx.lifecycle:lifecycle-common-java8:${Constants.lifecycle_version}")
    // optional - ReactiveStreams support for LiveData
    implementation("androidx.lifecycle:lifecycle-reactivestreams-ktx:${Constants.lifecycle_version}")


    debugImplementation ("com.readystatesoftware.chuck:library:1.1.0")
    releaseImplementation ("com.readystatesoftware.chuck:library-no-op:1.1.0")
    //Images
    implementation("com.github.bumptech.glide:glide:4.13.1") {
        exclude(group = "com.android.support", module = "support-annotations")
    }

    //Videos
    implementation("com.devbrackets.android:exomedia:4.3.0") {
        exclude(group = "com.google.android", module = "support-v7")
    }

    //Utilities
    implementation("com.github.maddog05:MaddogUtilities:1.0.1") {

        exclude(group = "com.android.support", module = "support-v7")
    }
    implementation("com.github.GrenderG:Toasty:1.3.0")
    implementation("com.github.whalemare:sheetmenu:1.3.6")
    kapt("com.github.bumptech.glide:compiler:4.13.1")

    // Test helpers

    // optional - Test helpers for LiveData
    testImplementation("androidx.arch.core:core-testing:2.1.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0") {
        exclude(group = "com.android.support", module = "support-annotations")
    }

    testImplementation("junit:junit:${Constants.junit}")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${Constants.kotlin_version}")
    testImplementation("androidx.room:room-testing:${Constants.room_version}")
    testImplementation("com.nhaarman:mockito-kotlin:1.6.0")

    implementation("androidx.paging:paging-rxjava2-ktx:${Constants.paging_version}")
    implementation("androidx.constraintlayout:constraintlayout:${Constants.constraint_layout}")
    implementation("androidx.recyclerview:recyclerview:1.2.1")
    implementation("androidx.viewpager:viewpager:1.0.0")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("androidx.gridlayout:gridlayout:1.0.0")

    implementation(project(":anilistclient", "default"))
}

//dokka {
//    outputFormat = "html"
//    outputDirectory = "$buildDir/javadoc"
//}
//project.afterEvaluate {
//    //Gather build type and product flavor names in a list
//    var buildTypes = android.buildTypes.collect { type -> type.name }
//    var productFlavors = android.productFlavors.collect { flavor -> flavor.name }
//    if (!productFlavors) {
//        productFlavors.add("")
//    }
//
//    productFlavors.each { productFlavorName ->
//        buildTypes.each { buildTypeName ->
//
//            //Define the sourceName and the sourcePath.
//            var sourceName
//            var sourcePath
//            if (!productFlavorName) {
//                sourceName = sourcePath = "${buildTypeName}"
//            } else {
//                sourceName = "${productFlavorName}${buildTypeName.capitalize()}"
//                sourcePath = "${productFlavorName}/${buildTypeName}"
//            }
//
//            var testTaskName = "test${sourceName.capitalize()}UnitTest"
//
////            task "create${sourceName.capitalize()}UnitTestCoverageReport"(type: JacocoReport,
////            dependsOn: "$testTaskName") {
////
////            group = "Reporting"
////            description =
////                "Generate Jacoco coverage reports on the ${sourceName.capitalize()} build."
////
////            reports {
////                xml.enabled (true)
////                html.enabled (true)
////            }
//
//            //Directory where the compiled class files are
////                classDirectories =
////                        fileTree(dir: "${project.buildDir}/tmp/kotlin-classes/${sourcePath}",
////                                excludes: ["**/R.class",
////                                           "**/BR.class",
////                                           "**/R$*.class",
////                                           "**/*$ViewInjector*.*",
////                                           "**/*$ViewBinder*.*",
////                                           "**/BuildConfig.*",
////                                           "android/**",
////                                           "**/Manifest*.*",
////                                           "**/*$Lambda$*.*", // Jacoco can not handle several "$" in class name.
////                                           "**/*Module.*", // Modules for Dagger.
////                                           "**/*Dagger*.*", // Dagger auto-generated code.
////                                           "**/*MembersInjector*.*", // Dagger auto-generated code.
////                                           "**/*_Provide*Factory*.*",
////                                           "**/*_Factory.*", //Dagger auto-generated code
////                                           "**/*$*$*.*" // Anonymous classes generated by kotlin
////                                ])
//
////                sourceDirectories = files(["src/main/java",
////                                           "src/$productFlavorName/java",
////                                           "src/$buildTypeName/java"])
////
////                executionData = files("${project.buildDir}/jacoco/${testTaskName}.exec")
//        }
//        }
//    //}
//}

/*
Takes value from Gradle project property and sets it as build config property
 */
//fun BaseFlavor.buildConfigFieldFromGradleProperty(gradlePropertyName: String) {
//    val propertyValue = project.properties[gradlePropertyName] as? String
//    checkNotNull(propertyValue) { "Gradle property $gradlePropertyName is null" }
//
//    val androidResourceName = "GRADLE_${gradlePropertyName.toSnakeCase()}".toUpperCase()
//    buildConfigField("String", androidResourceName, propertyValue)
//}
fun BaseFlavor.buildConfigFieldFromGradleProperty(androidResourceName: String, gradlePropertyName: String)   {
    val propertyValue = project.properties[gradlePropertyName] as? String
    checkNotNull(propertyValue) { "Gradle property $gradlePropertyName is null" }
    buildConfigField("String", androidResourceName, propertyValue)
}

/*
Return names of the features
 */
//fun getFeatureNames() = ModuleDependency
//    .getFeatureModules()
//    .map { it.replace(":feature_", "") }
//    .toTypedArray()

fun String.toSnakeCase() = this.split(Regex("(?=[A-Z])")).joinToString("_") { it.toLowerCase() }

/*
Adds a new field to the generated BuildConfig class
 */
//fun DefaultConfig.buildConfigField(name: String, value: Array<String>) {
//    // Create String that holds Java String Array code
//    val strValue = value.joinToString(prefix = "{", separator = ",", postfix = "}", transform = { "\"$it\"" })
//    buildConfigField("String[]", name, strValue)
//}
//apply plugin : "com.google.gms.google-services"
