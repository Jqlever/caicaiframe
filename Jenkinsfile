pipeline {
    agent any
    tools {
       JAVA8
       maven
    }
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
