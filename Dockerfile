FROM kdvolder/jdk8
MAINTAINER obu_jcfa003@iflytek.com
RUN mkdir -p /opt/jar/caicaiframe
COPY target/spring-mongodb-sample-0.0.1-SNAPSHOT.jar /opt/jar/caicaiframe
CMD java -jar spring-mongodb-sample-0.0.1-SNAPSHOT.jar
