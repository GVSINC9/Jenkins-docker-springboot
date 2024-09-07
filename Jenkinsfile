pipeline {
    agent any

     parameters{
        choice(name: 'action', choices: 'create\ndelete', description: 'Choose create/Destroy')
     }
    
    stages {
        stage('git checkout') {
                    when { expression {  params.action == 'create' } }
            steps {
                // Add your build steps here
                echo 'Checking out code..***********'
                git branch: 'Master', url: 'https://github.com/GVSINC9/Jenkins-docker-springboot.git'
            }
        }
        stage('Unit Test Maven') {
                    when { expression {  params.action == 'create' } }
            steps {
                // Add your build steps here
                echo 'Unit Test Maven..***********'
                sh 'mvn test'
            }
        }
         stage('Sonar Code Analysis') {
                    when { expression {  params.action == 'create' } }
            steps {
                // Add your deployment steps here
                echo 'Sonar Code Analysis ****************..**********'
                sh 'mvn clean package sonar:sonar'              
            }
        }
        
        stage('Integration Test Maven') {
                    when { expression {  params.action == 'create' } }
            steps {
                // Add your test steps here
                echo 'Integration Test Maven..**********'
               // sh 'mvn verify -DskipUnitTests'
            }
        }
        
        stage('Clean the saved snapshot') {
                    when { expression {  params.action == 'delete' } }
            steps {
                // Add your deployment steps here
                echo 'Deletering the snapshot jar filea ****************..**********'
                sh 'mvn clean'              
            }
        }
        



    }
}