FROM openjdk:17
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/camel-springboot-demo-0.0.1-SNAPSHOT.jar camelspringbootdemo.jar
EXPOSE 8181
ENTRYPOINT exec java $JAVA_OPTS -jar camelspringbootdemo.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar camelspringbootdemo.jar
