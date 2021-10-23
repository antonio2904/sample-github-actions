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
            }
        }
        stage('Prepare container') {
            steps {
                // Copy the Gradle cache from the host, so we can write to it
//                 sh "mkdir /root/.gradle"
//                 sh "mkdir -p /gradle-cache/.gradle"
//                 sh "cp -R /gradle-cache/.gradle/ /root"
                   sh "bundle exec fastlane prepare"
            }
        }
        stage('Build and Distribute') {
            steps {
                sh 'bundle exec fastlane distribute'
            }
            post {
                success {
                    // Write updates to the Gradle cache back to the host
                    sh "mkdir -p /gradle-cache/.gradle/caches"
                    sh "mkdir -p /gradle-cache/.gradle/wrapper"
                    sh "cp -R /root/.gradle/caches/ /root/.gradle/wrapper/ /gradle-cache/.gradle"
                }
            }
        }
    }
}
