FROM tomcat:9.0-jdk17

# Remove default apps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy WAR file
COPY app.war /usr/local/tomcat/webapps/ROOT.war

# Change Tomcat port
RUN sed -i 's/port="8080"/port="9092"/' /usr/local/tomcat/conf/server.xml

EXPOSE 8080

CMD ["catalina.sh", "run"]
