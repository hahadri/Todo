FROM tomcat:8.5

LABEL maintainer="falsebit@xyz"

ADD todo-web/target/todo-web-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]