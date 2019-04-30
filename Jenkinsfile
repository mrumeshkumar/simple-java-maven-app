pipeline { 
    agent any  
    tools { 
        maven 'Maven 3.3.9' 
        jdk 'jdk8' 
    }
    stages { 
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
        stage('Build') { 
            steps { 
               echo 'This is a minimal pipeline.' 
               // sh 'mvn -Dmaven.test.failure.ignore=true install'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                 echo 'mvn test' 
                sh 'mvn test'
            }
            post {
                always {
                      echo 'mvn test Post' 
                    junit 'target/surefire-reports/*.xml'
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
