pipeline {
    agent {
        dockerfile { 
            args '-u root' 
        }
    }
    stages {
        stage('Test') {
            steps {
                sh './gradlew clean'
                sh './gradlew --build-cache assembleDebug'
            }
        }
    }
}
