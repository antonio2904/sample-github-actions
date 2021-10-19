pipeline {
  agent {
    docker {
      image 'thyrlian/android-sdk'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'chown -R $(whoami) $ANDROID_HOME'
        sh './gradlew assembleDebug'
      }
    }

  }
}
