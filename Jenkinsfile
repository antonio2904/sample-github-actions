pipeline {
    agent {
        dockerfile { 
            args '-u root'
        }
    }
    stages {
//         stage('Test') {
//             steps {
//                 sh 'bundle update --bundler'
//                 sh 'bundle exec fastlane test'
//             }
//         }
//         stage('Build Release') {
//             steps {
//                 sh 'bundle exec fastlane beta'
//             }
//         }
        stage('Distribute') {
            steps {
                sh 'export FIREBASE_TOKEN=4/1AX4XfWi-lIpsTtmi1fS2yXpy1ipAXBfP32m0ryewicoDUO5o-GFOeeP0nAo'
                sh 'bundle exec fastlane distribute'
            }
        }
    }
}
