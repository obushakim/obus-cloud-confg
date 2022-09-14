FROM adoptopenjdk/openjdk11:alpine-jre
VOLUME /tmp

ARG APP_NAME="obus-cloud-config"
ARG APP_VERSION="0.0.1"
ARG JAR_FILE_CONTOH="/target/${APP_NAME}-${APP_VERSION}.jar"
ARG JAR_FILE="/target/*.jar"

ADD ${JAR_FILE} app.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 2222