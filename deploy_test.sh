#!/bin/bash
docker build -t spring-mongodb-sample:0.0.1-SNAPSHOT .
docker run -d --name test spring-mongodb-sample:0.0.1-SNAPSHOT
