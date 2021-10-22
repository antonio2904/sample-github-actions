pipeline {
    agent {
        dockerfile { 
            args '-u root'
        }
    }
    stages {
        stage('Update Fastlane and Bundler') {
            steps {
                sh 'bundle update fastlane'
                sh 'bundle update --bundler'
            }
        }
        stage('Build Release') {
            steps {
                sh 'bundle exec fastlane beta'
            }
        }
        stage('Distribute') {
            steps {
                sh 'bundle exec fastlane distribute'
            }
        }
    }
}
