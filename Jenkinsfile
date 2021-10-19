pipeline {
  agent {
    docker {
      image 'androidsdk/android-29'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'sudo chmod a+rwx /opt/android-sdk-linux'
        sh './gradlew assembleDebug'
      }
    }

  }
}
