pipeline {
  agent {
    docker {
      image 'thyrlian/android-sdk'
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