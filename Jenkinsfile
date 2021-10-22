pipeline {
    agent {
        dockerfile { 
            args '-u root'
        }
    }
    stages {
        stage('Update Fastlane and Bundler') {
            steps {
                sh 'bundle update --bundler'
                sh 'bundle update fastlane'
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
