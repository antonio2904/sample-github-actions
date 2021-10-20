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
        stage('Test') {
            steps {
//                 sh './gradlew clean'
                sh './gradlew --build-cache assembleDebug'
            }
        }
    }
}
