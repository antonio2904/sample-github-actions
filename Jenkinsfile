pipeline {
    agent {
        dockerfile { 
            args '-u root'
        }
    }
    stages {
        stage('Test') {
            steps {
//                 sh './gradlew clean'
                sh 'fastlane run gradle'
            }
        }
    }
}
