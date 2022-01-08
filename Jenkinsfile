pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                build quietPeriod: 5, job: 'welcome'
                echo 'Hello World ${Version}'
            }
        }
        stage('Test') {
           steps {
                echo 'Test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy'
            }
        }
        stage('Release') {
            steps {
                echo 'Release'
            }
        }
    }
    
}
