# ldap 

Le Ldap est dans un docker afin de simplifier sa mise en place. 
Le ldif est diponible directement dans le dossier ldap  si on ne souhaite pas utiliser l'image docker. 

Pour lancer l'image docker 

1. build docker : 
  	`docker build -t apacheds:apacheds ldap`

2. run docker img : 
 `docker run -dt --name apacheds_container -p 389:10389 -p 636:10636 apacheds:apacheds` 
