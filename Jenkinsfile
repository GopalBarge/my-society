pipeline {
    agent any
    tools {
                    jdk 'jdk8'
                   }
    stages {
        stage('Build') {
            steps {
               gradlew('clean')
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                 gradlew('clean', 'test')
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
   /* sh "gradlew ${args.join(' ')} -s" */
   if (isUnix()) {
   sh "./gradlew ${args.join(' ')}"
   } else {
   bat "gradlew.bat ${args.join(' ')}"
   }
}