pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /home/.m2/repository:/root/.m2 -v /opt/middleware/maven/apache-maven-3.6.3/conf/settings.xml:/root/.m2/settings.xml --entrypoint=' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
        stage('Deliver') { 
            steps {
                sh 'ssh root@172.31.161.83'
                sh 'scp root@172.31.161.96:/opt/middleware/jenkins/workspace/caicaiframe/target/spring-mongodb-sample-0.0.1-SNAPSHOT.jar /opt/jar/test'
            }
        }
    }
}
