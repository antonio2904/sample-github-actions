pipeline {
    agent {
        dockerfile true
        args '-u root'
//         docker { 
//             args '-u root' 
//         }
    }
    stages {
        stage('Test') {
            steps {
                sh './gradlew assembleDebug'
            }
        }
    }
}
