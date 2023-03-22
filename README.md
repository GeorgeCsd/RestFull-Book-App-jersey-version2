# RestFull-Book-App-jersey-version2

A simple Java EE7(JAX-RS)application that:

-get one object/multiple objects from database

-update data from db

-delete data from db

(We connect with the database using Entity Manager class)



# Prerequisites
JDK 8
Maven 3.0.3 or newer



# Test
mvn clean install -DskipTests



# Generate War and add it on Tomcat9/webapps
war:war org.codehaus.mojo:wagon-maven-plugin:upload-single -Dwagon.fromFile=C:\yourFilePosition\RestController-1.0-SNAPSHOT.war -Dwagon.url=file://C:\yourTomcatPosition\apache-tomcat-9.0.71\webapps\
