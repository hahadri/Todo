pipeline {
    agent any
    tools {
        maven 'mvn'
        jdk 'jdk8'
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/hahadri/Todo.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true clean compile'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
        publish('Build and publish image to DockerHube') {
            docker.withRegistry('https://registry.example.com', 'dockerhub') {

                def customImage = docker.build("todo")

                /* Push the container to the custom Registry */
                customImage.push()
            }
        }

    }


}