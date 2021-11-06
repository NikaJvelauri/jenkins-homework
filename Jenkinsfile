pipeline {
  agent any
  stages {
    stage('stage1') {
      parallel {
        stage('stage1') {
          steps {
            bat 'mvn -version'
          }
        }

        stage('') {
          steps {
            bat 'mvn compile'
          }
        }

      }
    }

  }
}