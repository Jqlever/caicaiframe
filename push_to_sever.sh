#!/bin/bash
ssh root@172.31.161.83
scp root@172.31.161.96:/opt/middleware/jenkins/workspace/caicaiframe/target/spring-mongodb-sample-0.0.1-SNAPSHOT.jar /opt/jar/test
nohup /home/java/jdk1.8.0_171/bin/java -jar /opt/jar/test/spring-mongodb-sample-0.0.1-SNAPSHOT.jar &
