FROM tomcat:9.0-jre8-alpine 
VOLUME /tmp
COPY bs-docker-1.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]