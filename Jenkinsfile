pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                bat 'mvn -B -DskipTests clean package' 
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Deliver for development') {
            steps {
                bat """.\\jenkins\\scripts\\deliver.sh"""
            }
        }
        stage('Deploy for production') {
            
            steps {
                bat """.\\jenkins\\scripts\\deliver.sh"""
                input message: 'Finished using the web site? (Click "Proceed" to continue)'
                sh './jenkins/scripts/kill.sh'
            }
        }
    }
}