pipeline {
    agent { dockerfile true }
    stages {
        stage('Run Tests') {
            steps {
                withEnv(['PATH+EXTRA=/usr/sbin:/usr/bin:/sbin:/bin']) {
                    sh "./gradlew testDebugUnitTest"
                }
            }
        }
    }
}
