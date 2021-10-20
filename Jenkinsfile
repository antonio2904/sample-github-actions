pipeline {
    agent {
        dockerfile { 
            args '-u root'
            args  '-v /var/cache/gradle:/tmp/gradle-user-home:rw'
        }
    }
    environment {
        HOME = '/home/android'
        GRADLE_CACHE = '/tmp/gradle-user-home'
    }
    stages {
        stage('Prepare container') {
            steps {
                // Copy the Gradle cache from the host, so we can write to it
                sh "rsync -a --include /caches --include /wrapper --exclude '/*' ${GRADLE_CACHE}/ ${HOME}/.gradle || true"
            }
        }
            
        stage('Test') {
            steps {
//                 sh './gradlew clean'
                sh './gradlew --build-cache assembleRelease'
            }
        }
    }
    post {
        success {
            // Write updates to the Gradle cache back to the host
            sh "rsync -au ${HOME}/.gradle/caches ${HOME}/.gradle/wrapper ${GRADLE_CACHE}/ || true"
        }
    }
}
