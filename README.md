# JSP Project Template
* **Objective** - To create a service which can ...
* **Purpose** - To gain familiarity with the following topics:
    * JSPs
    * Apache Tomcat
    * Servlets
* **Description**
    * Ensure that you have [installed Apache Tomcat](http://tomcat.apache.org/download-80.cgi)
        * For windows installer, click [here](http://apache.mirrors.hoobly.com/tomcat/tomcat-8/v8.5.57/bin/apache-tomcat-8.5.57.exe)
    





## For APIs

### Run test
```
$mvnw clean test
```

### Create WAR file
```
$mvnw clean package
```

###  How to run web server with Apache Tomcat ?

```
$mvnw tomcat7:run
```

###  Run in browser 
* http://localhost:8080/api/hello
* http://localhost:8080/api/hello.html



#### Step to create server

1. สร้าง MySQL Database
```
docker container run -d -p 3306:3306  \
-e MYSQL_ROOT_PASSWORD=password \
-e MYSQL_DATABASE=wallet \
-e MYSQL_USER=user01 \
-e MYSQL_PASSWORD=xitgmLwmp \
--name db2 mysql:5.7.21
```
