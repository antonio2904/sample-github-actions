node {
  checkout scm
  
  def customImage = docker.build("thyrlian/android-sdk")
  
  customImage.inside {
    sh "build"
  }
}
