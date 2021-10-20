pipeline {
  agent {
    docker {
      image 'thyrlian/android-sdk'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh './gradlew assembleDebug'
      }
    }
  }
}
