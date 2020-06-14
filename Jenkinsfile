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
        stage('Package') {
           steps {
             sh 'mvn package'
        	}
        }

    }


}