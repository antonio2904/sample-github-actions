pipeline {
  agent {
    docker {
      image 'thyrlian/android-sdk'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh '''chmod chown -R $(whoami) $ANDROID_HOME 
        ./gradlew assembleDebug'''
      }
    }
  }
}
