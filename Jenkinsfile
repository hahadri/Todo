pipeline {
    agent any
    tools {
    	maven 'mvn'
    	jdk 'jdk8'
    }
    stages  {
        stage('Checkout') {
        	steps {
            	git 'https://github.com/hahadri/BankManagement.git'
        	}
        }
        stage('Build') {
           steps {
               sh 'mvn -Dmaven.test.failure.ignore=true clean compile'
           }
        }
        stage('Test') {
           steps {
               sh 'mvn test'
               junit '*/target/surefire-reports/**/*.xml', allowEmptyResults:true
           }
        }
        stage('Package') {
           steps {
             sh 'mvn package'
        	}
        }

    }


}