# Spring-Boot-Crud-Employee

One Paragraph of project description goes here

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Steps to run the Spring-Boot application

### Prerequisites

What things you need to install the software and how to install them

```
- Java
- PostgreSQL
- Maven
```

### Installing

This step is what you need

```
mvn clean install
```

 Create Database <br>
- Use whatever database you want. For Postgres database users, please follow the steps below :
- Create a database, can use a query or phpmyadmin. ex: *Create Database example;*
-  Next, set the database configuration in the project. Enter to folder *src/main/resources*. In *application.properties* replace a few things below
```java
spring.datasource.url=jdbc:postgresql://localhost:5432/(database-name)
spring.datasource.username=(username-database)
spring.datasource.password=(password-database)
```
## Running

And this step for running your application

```
mvn spring-boot:run
```
## Set up Master Data

- Insert some query from *data.sql* in project folder
```
INSERT INTO T1_POSITION(id, code, name, is_delete) values (1, PRG, Programmer, 0);
INSERT INTO T1_POSITION(id, code, name, is_delete) values (2, BPR, BPR, 0);
INSERT INTO T1_POSITION(id, code, name, is_delete) values (3, TEST, Tester, 0);
INSERT INTO T1_POSITION(id, code, name, is_delete) values (4, HELP, Help Desk, 0);
INSERT INTO T1_POSITION(id, code, name, is_delete) values (5, STF, Staff, 0);
```

## Example App

![List Employee](https://raw.githubusercontent.com/ragilarain/Spring-Boot-CRUD-Employee/master/img/List-Employee.png)



## Authors

* **Ragil Arain Sawala** - *Initial work* - [Ragil Arain](https://github.com/ragilarain)

## Cherrio
