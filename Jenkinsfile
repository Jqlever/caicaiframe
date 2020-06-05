pipeline {
    agent {
        label 'node1'   
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -DskipTests clean package' 
            }
        }
        stage('Deploy') { 
            steps {
                sh 'sh deploy_test.sh' 
            }
        }
    }
}
