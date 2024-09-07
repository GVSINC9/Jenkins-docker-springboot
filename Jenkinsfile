pipeline {
    agent any

     parameters{
        choice(name: 'action', choices: 'create\ndelete', description: 'Choose create/Destroy')
     }
    
    stages {
        stage('git checkout') {
            steps {
                // Add your build steps here
                echo 'Checking out code..***********'
                git branch: 'Master', url: 'https://github.com/GVSINC9/Jenkins-docker-springboot.git'
            }
        }
        stage('Unit Test Maven') {
            steps {
                // Add your build steps here
                echo 'Unit Test Maven..***********'
                sh 'mvn test'
            }
        }
        
        stage('Integration Test Maven') {
            steps {
                // Add your test steps here
                echo 'Integration Test Maven..**********'
                sh 'mvn verify -DskipUnitTests'
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