pipeline {
    agent {
        dockerfile true
        docker { 
            args '-u root' 
        }
    }
    stages {
        stage('Test') {
            steps {
                sh './gradlew assembleDebug'
            }
        }
    }
}
