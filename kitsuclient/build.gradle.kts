plugins {
    id("com.android.library")
    kotlin("android")
    id("kotlin-parcelize")
}

android {
    namespace = "pt.dbmg.kitsuclient"
    compileSdk = Constants.compileSdk
    defaultConfig {
        minSdk = Constants.minSdk
        targetSdk = Constants.targetSdk
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"

    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Constants.kotlin_version}")
    implementation("androidx.appcompat:appcompat:${Constants.app_compat}")
    implementation("androidx.core:core-ktx:${Constants.core_ktx}")

    //tests
    testImplementation("junit:junit:${Constants.junit}")
    androidTestImplementation("com.android.support.test:runner:${Constants.test_runner}")
    androidTestImplementation("com.android.support.test.espresso:espresso-core:${Constants.test_espresso}")
}
repositories {
    mavenCentral()
}