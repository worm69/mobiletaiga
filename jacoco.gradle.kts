plugins {
  kotlin("jacoco")
}

def fileFilter = [
    '**/*Parcel.class',
    '**/*$CREATOR.class',
    '**/*Test*.*',
    '**/AutoValue_*.*',
    '**/*JavascriptBridge.class',
    '**/R.class',
    '**/R$*.class',
    '**/Manifest*.*',
    'android/**/*.*',
    '**/BuildConfig.*',
    '**/*$ViewBinder*.*',
    '**/*$ViewInjector*.*',
    '**/Lambda$*.class',
    '**/Lambda.class',
    '**/*Lambda.class',
    '**/*Lambda*.class',
    '**/*$InjectAdapter.class',
    '**/*$ModuleAdapter.class',
    '**/*$ViewInjector*.class',
    '**/*_MembersInjector.class', //Dagger2 generated code
    '*/*_MembersInjector*.*', //Dagger2 generated code
    '**/*_*Factory*.*', //Dagger2 generated code
    '**/*Component*.*', //Dagger2 generated code
    '**/*Module*.*' //Dagger2 generated code
]

//def debugTree = fileTree(dir: "${buildDir}/intermediates/classes/debug", excludes: fileFilter)
//def mainSrc = "${project.projectDir}/src/main/java"
//def kotlinDebugTree = fileTree(dir: "${buildDir}/tmp/kotlin-classes/debug", excludes: fileFilter)

jacoco {
  version = "$jacoco_version"
  toolVersion = "$jacoco_version"
}
// enforce proper setting on android type projects.
android {
  testOptions {
    unitTests {
      includeAndroidResources = true
      returnDefaultValues = true
    }
    unitTests.all {
      jacoco {
        includeNoLocationClasses = true
//        destinationFile file("$buildDir/jacoco/test.exec-partial")
      }
    }
  }
}

//task jacocoTestReport(type: JacocoReport, dependsOn: "testDebugUnitTest") {
//  group = "Reporting"
//  description = "Generating Jacoco coverage reports"
//
//  reports {
//    xml.enabled = true
//    html.enabled = true
//    csv.enabled = true
//    xml.destination file("${rootProject.buildDir}/reports/jacocoTestReport-${project.name}.xml")
//    html.destination file("${buildDir}/reports/jacoco")
//    csv.destination file("${buildDir}/reports/jacocoTestReport.csv")
//  }
//  sourceDirectories = files([mainSrc])
//  classDirectories = files([debugTree], [kotlinDebugTree])
//  executionData = fileTree(dir: buildDir, includes:
//      ['**/*.exec', '**/*.ec'])
//}