pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -DskipTests clean package' 
            }
        }
        stage('Deploy') { 
            steps {
                sh 'docker build -t spring-mongodb-sample:0.0.1-SNAPSHOT .' 
            }
        }
    }
}
