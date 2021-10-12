pipeline {
    agent { dockerfile true }
    stages {
        stage('Run Tests') {
            steps {
                echo 'Running Tests'
                script {
                    sh "./gradlew testDebugUnitTest"
                }
            }
        }
    }
}
