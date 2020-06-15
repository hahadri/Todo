pipeline {
    agent any
    tools {
        maven 'mvn'
        jdk 'jdk8'
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
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
        stage('Build and publish image to DockerHube') {
            steps
                    {
                        script {
                            withDockerRegistry([credentialsId: 'dockerhub', url: "https://hub.docker.com/"]) {

                                def customImage = docker.build("todo:${env.BUILD_ID}")

                                /* Push the container to the custom Registry */
                                customImage.push()
                            }
                        }
                    }
        }

    }


}