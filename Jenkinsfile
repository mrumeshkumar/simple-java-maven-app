pipeline { 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
               echo 'This is a minimal pipeline.' 
            }
        }
        stage('Test') {
            steps {
                 echo 'mvn test' 
              //  sh 'mvn test'
            }
            post {
                always {
                      echo 'mvn test Post' 
                 //   junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Deliver') {
            steps {
                  echo 'mvn Deliver' 
              //  sh './jenkins/scripts/deliver.sh'
            }
        }
    }
}
