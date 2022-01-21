FROM openjdk:11.0.5-slim-buster
RUN apt-get update
RUN apt-get install ca-certificates -y
RUN apt-get install systemd -y
RUN apt-get install wget procps -y
RUN apt-get install ldap-utils -y

WORKDIR /tmp
COPY ./user.ldif  .
COPY ./startup.sh  .
RUN chmod 755 /tmp/startup.sh

RUN wget --no-check-certificate https://dlcdn.apache.org//directory/apacheds/dist/2.0.0.AM26/apacheds-2.0.0.AM26-amd64.deb
RUN chmod +x apacheds-2.0.0.AM26-amd64.deb
RUN dpkg -i apacheds-2.0.0.AM26-amd64.deb
RUN apt-get -f install
RUN mv /etc/init.d/apacheds-2.0.0.AM26-default /etc/init.d/apacheds
RUN service apacheds restart
#CMD /tmp/startup.sh

EXPOSE 10389 10636