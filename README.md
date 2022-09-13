# CarAnnouncementProject
## Description
In this exercise, you will create an application that simulates a database in which you can post car announcement ads. The database will keep records of cars for sale. Your program should present the user (dealer) with a command line option menu of possible actions they can take. The options should be as follows:

1) Show all existing car announcement in the database.
2) Add a new car announcement to the database.
3) Delete a car announcement from a database.
4) Update a car announcement in the database.
5) You can make your announcement VIP by increasing your balance

## Technologies

Rest JPA API with Spring Boot, PostgreSql, JPA

## Steps to Setup
1. Clone the application


      https://github.com/suleymanmehdiyev/CarAnnouncementProject.git
2. Create PostgreSQL database


    create database car_database
3. Change mysql username and password as per your installation
* open src/main/resources/application.properties

* change spring.datasource.username and spring.datasource.password as per your postgresql installation

4. Build and run the app using maven


    mvn package
    java -jar target/spring-boot-rest-api-tutorial-0.0.1-SNAPSHOT.jar
Alternatively, you can run the app without packaging it using -


    mvn spring-boot:run
