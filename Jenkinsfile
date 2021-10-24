pipeline {
    agent {
        dockerfile { 
            args '-u root --mount source=sample-gradle-cache,target=/gradle-cache'
        }
    }
    stages {
        stage('Prepare container') {
            steps {
                // Copy the Gradle cache from the host, so we can write to it
                sh "rsync -a --include /caches --include /wrapper --exclude '/*' /gradle-cache/ /root/.gradle || true"
            }
        }
        stage('Update Bundler') {
            steps {
                sh 'bundle update --bundler'
            }
        }
        stage('Lint check') {
            steps {
                sh 'bundle exec fastlane lint'
            }
        }
        stage('Run tests') {
            steps {
                sh 'bundle exec fastlane test'
            }
        }
        stage('Build and Distribute') {
            steps {
                sh 'bundle exec fastlane distribute'
            }
            post {
                success {
                    // Write updates to the Gradle cache back to the host
                    sh "rsync -av /root/.gradle/caches /root/.gradle/wrapper /gradle-cache/ || true"
                }
            }
        }
    }
}
