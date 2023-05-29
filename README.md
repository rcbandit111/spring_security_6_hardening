# spring_security_6_hardening

Proof of a concept project for improving Spring Security 6 integrated with Keycloak Authorization server


## steps
1. you should install self-signed cert in your jdk

E:\Java\jdk-17.0.5\bin\keytool -import -alias myCert -file api3.hireya.org.crt -keystore E:\Java\jdk-17.0.5\lib\security\cacerts

E:\Java\jdk-17.0.5 is just a sample of jdk, you should replace it with your own jdk path