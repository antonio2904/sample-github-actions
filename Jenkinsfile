pipeline {
  agent {
    docker {
      image 'thyrlian/android-sdk'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'chown -R $(antonio2904) $ANDROID_HOME'
        sh './gradlew assembleDebug'
      }
    }

  }
}
