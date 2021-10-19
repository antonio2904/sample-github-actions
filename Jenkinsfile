pipeline {
  agent {
    docker {
      image 'androidsdk/android-29'
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