pipeline {
  agent {
    docker {
      image 'androidsdk/android-29'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'chown android:android /opt/android-sdk-linux'
        sh './gradlew assembleDebug'
      }
    }

  }
}
