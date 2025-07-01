pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/antonier-g/pry-calculadora.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t calculadora-app .'
            }
        }

        stage('Run Container') {
            steps {
                script {
                    bat '''
                        docker stop calculadora-app || echo No container to stop
                        docker rm calculadora-app || echo No container to remove
                        docker run -d --name calculadora-app -p 7777:7777 calculadora-app
                    '''
                }
            }
        }
    }
}