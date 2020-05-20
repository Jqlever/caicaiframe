pipeline {
    agent {
        docker {
            image 'daocloud.io/library/maven:3-alpine' 
            args '-v /home/.m2/repository:/root/.m2 -v /opt/middleware/maven/apache-maven-3.6.3/conf/settings.xml:/root/.m2/settings.xml --entrypoint=' 
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
