pipeline {
  agent {
    docker {
      image 'openjdk:8'
      args '-p 50000:50000'
    }

  }
  stages {
    stage('Run Tests') {
      steps {
        sh './gradlew testDebugUnitTest'
      }
    }

  }
}