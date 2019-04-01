FROM java:8-jre
MAINTAINER jenkinsk8s

RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo "Asia/shanghai" > /etc/timezone

ADD target/jenkinsk8s-0.0.1.jar /app/jenkinsk8s.jar

EXPOSE 8082

VOLUME /logs

CMD ["nohup", "java", "-jar", "/app/jenkinsk8s.jar", ">", "/dev/null", "&"]

