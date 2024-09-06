pipeline {
    agent any
    
    stages {
        stage('git checkout') {
            steps {
                // Add your build steps here
                echo 'Checking out code..***********'
                git branch: 'Master', url: 'https://github.com/GVSINC9/Jenkins-docker-springboot.git'
            }
        }
        stage('Build') {
            steps {
                // Add your build steps here
            }
        }
        
        stage('Test') {
            steps {
                // Add your test steps here
                echo 'Testing..**********'
            }
        }
        
        stage('Deploy') {
            steps {
                // Add your deployment steps here
                echo 'Deploying..**********'
            }
        }
    }
}