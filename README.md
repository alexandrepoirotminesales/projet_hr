# projet_hr

coucou


## ldap 

 build docker : docker build -t apacheds:apacheds ldap

 run docker img : docker run -dt --name apacheds_container -p 389:10389 -p 636:10636 apacheds:apacheds 
