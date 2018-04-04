FROM  openweb/oracle-tomcat:latest

EXPOSE 8090

COPY target/service-springboot-0.1.0.jar /opt/service-springboot.jar
COPY startapp.sh /opt/startapp.sh

CMD /opt/startapp.sh
