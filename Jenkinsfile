pipeline {
    agent any
    tools {
                    jdk 'jdk8'
                   }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
sh “./gradlew test”
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