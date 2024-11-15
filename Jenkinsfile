pipeline {
    agent any
    
    environment {
        // Set JAVA_HOME to the location of your JDK
        JAVA_HOME = 'C:\\Program Files\\JDK17'  // Make sure this path matches your actual Java installation
        PATH = "${JAVA_HOME}/bin:${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/sakthimathan/Jenkins_faceBook.git'
            }
        }

        stage('Build') {
            steps {
               withMaven(maven: 'Maven') {
                    bat "mvn clean verify -f C:/Users/Lenovo/eclipse-workspace_Sakthi/Jenkins_Project/pom.xml"
                }
            }
        }
        stage('Report') {
            steps {
                // Copy reports to a specific directory
                copyArtifacts from: '**/target/cucumber-reports/**', intoWorkspace: true
            }
        }
        
        stage('Publish Artifacts') {
            steps {
              cucumber buildStatus: 'UNCHANGED', customCssFiles: '', customJsFiles: '', failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: '**/*.json', jsonReportDirectory: 'target', pendingStepsNumber: -1, reportTitle: 'FaceBook', skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
            }
        }
    }
}
