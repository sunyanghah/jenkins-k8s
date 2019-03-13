FROM java:8-jre
MAINTAINER jenkinsk8s

RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo "Asia/shanghai" > /etc/timezone

ADD target/*.jar /app/jenkinsk8s.jar
CMD ["nohup", "java", "-jar", "/app/jenkinsk8s.jar", ">", "/dev/null", "&"]

