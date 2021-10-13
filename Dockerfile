FROM openjdk:11-jre-slim
MAINTAINER Abzal

ENV TZ=Asia/Almaty
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
VOLUME /tmp
ARG JAR_FILE
ADD ./target/demo3-1.0.0.jar /app/
EXPOSE 8085
ENTRYPOINT ["java","-XX:+UnlockExperimentalVMOptions","-jar","/app/demo3-1.0.0.jar"]
