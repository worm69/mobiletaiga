project.parent.tasks["sonarqube"].dependsOn project.name + ":jacocoTestReport"