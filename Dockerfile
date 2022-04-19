FROM openjdk:8-jdk-alpine
LABEL editor="josemiguel-chvz"
RUN mkdir -p /app
ADD target/app_eval_1-0.0.1-SNAPSHOT.jar /app/app_eval_1-0.0.1-SNAPSHOT.jar
WORKDIR /app
CMD java -Dserver.port=$PORT $JAVA_OPTS -jar app_eval_1-0.0.1-SNAPSHOT.jar