pipeline {
    agent any
    tools {
        gradle "gradle-5.2.1"
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                  sh 'gradle --version'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}