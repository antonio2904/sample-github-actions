pipeline {
    agent {
        dockerfile { 
            args '-u root --mount source=sample-gradle-cache,target=/gradle-cache'
        }
    }
    stages {
        stage('Update Fastlane and Bundler') {
            steps {
                sh 'bundle update --bundler'
//                 sh 'bundle update fastlane'
            }
        }
        stage('Prepare Container') {
            steps {
                // Copy the Gradle cache from the host, so we can write to it
                sh "bundle exec fastlane prepare"
            }
        }
        stage('Build and Distribute') {
            steps {
                sh 'bundle exec fastlane distribute'
            }
        }
        stage('Cache') {
            steps {
                sh 'bundle exec fastlane cache'
            }
        }
    }
}
