pipeline {
  agent {
    docker {
      image 'thyrlian/android-sdk'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'chmod o-rwx /opt/android-sdk'
        sh './gradlew assembleDebug'
      }
    }

  }
}
