FROM openjdk:8 AS build
WORKDIR /app
RUN wget https://github.com/grails/grails-core/releases/download/v2.4.5/grails-2.4.5.zip \
    && unzip grails-2.4.5.zip \
    && mv grails-2.4.5 /opt/grails
ENV GRAILS_HOME=/opt/grails
ENV PATH="$GRAILS_HOME/bin:$PATH"
COPY ./EduCareDeploy /app
RUN grails war



FROM tomcat:9.0.82-jdk8-temurin
LABEL "Project"="VETBIDATCOL"
LABEL "Author"="Jai"
WORKDIR /usr/local/tomcat/webapps/
RUN rm -rf ROOT*
COPY --from=build /app/target/*.war ROOT.war
RUN apt-get update && apt-get install -y wget tar \
    && wget -O mysql-connector-java.tar.gz https://downloads.mysql.com/archives/get/p/3/file/mysql-connector-java-5.1.29.tar.gz \
    && tar -xzf mysql-connector-java.tar.gz \
    && mv mysql-connector-java-5.1.29/mysql-connector-java-5.1.29-bin.jar /usr/local/tomcat/lib/ \
    && rm -rf mysql-connector-java* \
    && apt-get clean
    
ENV DB_HOST=db \
    DB_PORT=3306 \
    DB_NAME=educare_prod \
    DB_USER=educare \
    DB_PASSWORD=EducareHitpL_2019

COPY wait-for-mysql.sh /usr/local/bin/wait-for-mysql.sh
RUN chmod +x /usr/local/bin/wait-for-mysql.sh


EXPOSE 8080
CMD ["/usr/local/bin/wait-for-mysql.sh"]
