FROM amazoncorretto:17
ARG JAR_FILE=aws-services-1.0.jar
ARG APP_NAME=demo-services-1.0.jar
ADD target/$JAR_FILE $APP_NAME
ENV APP_NAME_EXECUTABLE=$APP_NAME
ENTRYPOINT java -jar $APP_NAME_EXECUTABLE
