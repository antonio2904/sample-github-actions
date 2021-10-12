pipeline {
    agent { dockerfile true }
    stages {
        stage('Run Tests') {
            source /etc/profile
            steps {
                sh "./gradlew testDebugUnitTest"
            }
        }
    }
}
