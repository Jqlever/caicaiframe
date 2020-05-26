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
                sh '' 
            }
        }
    }
}
