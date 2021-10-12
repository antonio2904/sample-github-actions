pipeline {
    agent { dockerfile true }
    stages {
        stage('Run Tests') {
            steps {
                source /etc/profile
                sh "./gradlew testDebugUnitTest"
            }
        }
    }
}
