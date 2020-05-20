pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /home/.m2/repository:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
}
