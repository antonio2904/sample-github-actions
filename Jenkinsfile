pipeline {
    agent {
        dockerfile { 
            args '-u root'
        }
    }
    stages {
        stage('Test') {
            steps {
                sh 'bundle exec fastlane test'
            }
        }
        stage('Build Release') {
            steps {
                sh 'bundle exec fastlane beta'
            }
        }
    }
}
