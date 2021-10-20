pipeline {
    agent {
//         dockerfile true
//         args '-u root'
        dockerfile { 
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
