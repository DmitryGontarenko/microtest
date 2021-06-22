pipeline {
   agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh './gradlew build'
                echo 'Build has been completed '
            }
        }
    }
}