pipeline {
    agent {
        docker { 
            dockerfile true 
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
