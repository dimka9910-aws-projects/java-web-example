FROM openjdk:11

ENV TARGET_PATH=/opt/dev/services

ENV SERVICE_NAME=java-web-example
ENV SERVICE_TITLE=EXAMPLE-REST-SERVICE
ENV SERVICE_PORT=8080

COPY target/*.jar $TARGET_PATH/app.jar
COPY scripts/ $TARGET_PATH/scripts/
EXPOSE $SERVICE_PORT

CMD ["/bin/bash", "-c", "$TARGET_PATH/scripts/service-script.sh"]