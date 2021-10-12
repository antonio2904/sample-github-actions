pipeline {
    agent { dockerfile true }
    stages {
        stage('Run Tests') {
            def dockerHome = tool 'MyDocker'
            def mavenHome = tool 'MyMaven'
            env.PATH = "${dockerHome}/bin:${mavenHome}/bin:${env.PATH}"
            steps {
                echo 'Running Tests'
                script {
                    sh "./gradlew testDebugUnitTest"
                }
            }
        }
    }
}
