 pipeline {
    agent any
    stages {
        stage ('Checking java version') {
            steps {
                    sh 'java -version'
            }
        }
        stage ('maven version') {
            steps {               
                    sh 'mvn -version'                
            }
        }
        stage ('build app test') {
            steps {               
                    sh 'mvn clean install '                                    
            }
        }
        
        stage ('docker image build')
        {
            steps {
                   
                        sh 'docker build -t ahteshamdocker/my-pipeline-app .'
                         
                  }
          }
          stage ('docker image push to Docker Hub') {
            steps {               
                    sh 'docker image push ahteshamdocker/my-pipeline-app:latest'                          
            }
        }
    }
}
