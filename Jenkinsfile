pipeline {
    agent any
    tools {
                    jdk 'jdk8'
                   }
    stages {
        stage('Build') {
            steps {
               gradlew('clean', 'classes')
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
def gradlew(String... args) {
    echo 'Running step....'+args
    sh "/gradlew ${args.join(' ')} -s"
}