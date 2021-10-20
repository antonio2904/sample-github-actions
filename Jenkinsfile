pipeline {
    agent {
        docker { 
            image 'thyrlian/android-sdk' 
            args '-u root' 
        }
    }
    stages {
        stage('Test') {
            steps {
                sh './gradlew assembleDebug'
            }
        }
    }
}
