pipeline {
    agent {
        docker { image 'thyrlian/android-sdk' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'adb --version'
            }
        }
    }
}
