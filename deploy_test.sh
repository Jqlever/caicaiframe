#!/bin/bash
#/usr/bin/docker build -t spring-mongodb-sample:0.0.1-SNAPSHOT .
#docker run -d --name test spring-mongodb-sample:0.0.1-SNAPSHOT
java -jar t/var/jenkins_home/workspace/caicaiframe/target/spring-mongodb-sample-0.0.1-SNAPSHOT.jar
