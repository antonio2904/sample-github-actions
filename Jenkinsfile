pipeline {
  agent {
    docker {
      image 'thyrlian/android-sdk'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh "chmod +x -R ${env.WORKSPACE}"
        sh './gradlew assembleDebug'
      }
    }

  }
}
