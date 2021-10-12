pipeline {
    agent { dockerfile true }
    stages {
        stage('Run Tests') {
            steps {
                sh "./gradlew testDebugUnitTest"
            }
        }
    }
}
