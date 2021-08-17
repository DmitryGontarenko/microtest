pipeline {
   agent any
    options {
        timestamps()
    }
    stages {
        stage('Run Project') {
            steps {
                echo 'Running...'
                sh './gradlew run'
                echo 'Build has been completed '
            }
        }
        stage('Test Project') {
            steps {
                echo 'Testing...'
                sh './gradlew test'
                echo 'Tests has been completed '
            }
        }
    }
}