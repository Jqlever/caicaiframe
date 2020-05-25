pipeline {
    agent { 
        docker {
            image 'maven:3-alpine'
            args '-v /opt/middleware/maven/apache-maven-3.6.3/conf/settings.xml:/root/.m2/settings.xml'
        }
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
