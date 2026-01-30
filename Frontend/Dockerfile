
FROM tomcat:10.1-jdk17
WORKDIR  /var/lib/tomcat/webapps/
COPY app.war ./app.war
EXPOSE 8080
CMD ["catalina.sh", "run"]
