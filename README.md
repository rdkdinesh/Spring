#Spring-Crud-Demo

Spring CRUD demo is demonstrating how to implement simple CRUD operations with a Employee entity.

#What's inside

This project is based on the Spring Framework project and uses these packages :

Maven
Spring Core
Spring Data (Hibernate & MySQL)
Spring MVC (Tomcat)
Installation

The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies

#Database configuration

Create a MySQL database with the name springdb and add the credentials to dispatcher-servlet.xml(dindisp-servlet.xml).
The default ones are :

Set Bean Property(dataSource)
driverClassName="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3306/springdb"
password=""

#Usage

Run the project and head out to http://localhost:8080
