plugins {
    id("com.android.library")
    kotlin("android")
    id("kotlin-parcelize")
}

android {
    namespace = "pt.dbmg.anilistclient"
    compileSdk = Constants.compileSdk
    defaultConfig {
        minSdk=Constants.minSdk
        targetSdk=Constants.targetSdk
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"

    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildTypes {
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_11
            targetCompatibility = JavaVersion.VERSION_11
        }

        release {
            isMinifyEnabled = false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Constants.kotlin_version}")
    implementation ("androidx.appcompat:appcompat:${Constants.app_compat}")
    implementation ("androidx.core:core-ktx:${Constants.core_ktx}")
    implementation ("androidx.constraintlayout:constraintlayout:${Constants.constraint_layout}")
    //not comm
    implementation ("javax.servlet:servlet-api:2.5")
    implementation ("org.codehaus.jettison:jettison:1.4.1")
    implementation ("org.slf4j:slf4j-api:1.7.30")

    //tests
    testImplementation("junit:junit:${Constants.junit}")
    androidTestImplementation("com.android.support.test:runner:${Constants.test_runner}")
    androidTestImplementation("com.android.support.test.espresso:espresso-core:${Constants.test_espresso}")
}
repositories {
    mavenCentral()
}
