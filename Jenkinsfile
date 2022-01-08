pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                build quietPeriod: 5, job: 'welcome'
                echo "Hello World ${params.Version}"
            }
        }
        stage('Test') {
           steps {
                echo "${params.Version}"
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
