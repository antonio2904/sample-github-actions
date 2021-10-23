pipeline {
    agent {
        dockerfile { 
            args '-u root, --mount source=sample-gradle-cache,target=/gradle-cache'
        }
    }
    stages {
        stage('Prepare container') {
            steps {
                // Copy the Gradle cache from the host, so we can write to it
                sh "rsync -a --include /caches --include /wrapper --exclude '/*' /gradle-cache/ /root/.gradle || true"
            }
        }
        stage('Update Fastlane and Bundler') {
            steps {
                sh 'bundle update --bundler'
//                 sh 'bundle update fastlane'
            }
        }
        stage('Lint check') {
            steps {
                sh 'bundle exec fastlane lint'
            }
        }
        stage('Build and Distribute') {
            steps {
                sh 'bundle exec fastlane distribute'
            }
            post {
//                 always {
//                     archiveArtifacts artifacts: 'app/**/*.apk', fingerprint: true
//                 }
                success {
                    // Write updates to the Gradle cache back to the host
                    sh "rsync -au /root/.gradle/caches /root/.gradle/wrapper /gradle-cache/ || true"
                }
            }
        }
    }
}
