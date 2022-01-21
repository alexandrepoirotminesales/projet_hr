/etc/init.d/apacheds start
#ldapmodify -h localhost -p 10389 -D "uid=admin,ou=system" -w secret -a -f /tmp/user.ldif
