pipeline {
    agent { dockerfile true }
    stages {
        stage('Run Tests') {
            steps {
                withEnv(['PATH+EXTRA=/usr/sbin:/usr/bin:/sbin:/bin']){
                echo 'Running Tests'
                script {
                    sh "./gradlew testDebugUnitTest"
                }
                }
            }
        }
    }
}
