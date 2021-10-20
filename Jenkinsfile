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
                sh 'bundle update --bundler'
                sh 'bundle exec fastlane distribute'
            }
        }
    }
}
