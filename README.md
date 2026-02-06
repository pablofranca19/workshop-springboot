# Workshop Spring Boot
This repository was made in order to practice and learn a little bit more about Spring Boot framework, the project itself is a CRUD modeled in REST pattern application, in addition, it is also my first time building a project using Maven.

## Domain Model
<img width="1403" height="693" alt="Domain Model" src="https://github.com/user-attachments/assets/5644330e-1a2b-444b-9c4f-3b0b8344008b" />

## Stack Technologies ⚙️

* Java 17
* Maven 4.0
* Spring Boot 3.4.5
* PostgreSQL 18
* JPA/Hibernate
## Files
### On this section, take a deeper focus on these two files:
* src
* pom.xml
## 
* **src: the source code of the project, where you will understand it later**
* **pom.xml: dependecy injection as it is a Maven project**
## Taking a wider look in /src/main:
### - src/main: leads to a path which has two folders, those are:

- **src/main/java/com/educandoweb/course: the "heart" of the project, with layers**
- **src/main/resources: properties and roles when the application is running**
## Application layers

- src/main/java/com/educandoweb/course/**config**: configuration class, database seeding
- src/main/java/com/educandoweb/course/**entities**: the entities of the workshops and its relationships with other objects
- src/main/java/com/educandoweb/course/**repositories**: JPA repositories for data persistence
- src/main/java/com/educandoweb/course/**resources**: endpoints classes for each entity
- src/main/java/com/educandoweb/course/**service**: service layer with business rules for the application

## How to run the project
### Pre-requisites
#### Before running the application, ensure the following:

* Java Development Kit (JDK) version 17 is installed and properly configured in your system's PATH.
* You are using git terminal (if you're using Windows), if Linux, the terminal itself works perfectly.
* You are in the project's root directory in your bash terminal

```bash
# Make a folder to store the project
mkdir spring-project
```
```bash
# Inside the folder, clone the project
git clone git@github.com:pablofranca19/workshop-springboot.git
```
```bash
# Change the directory to workshop-springboot
cd workshop-springboot
```
```bash
# As you are in the project's path, you now may execute
./mvnw spring-boot:run
```
```bash
# If the terminal displays e.g "command not found" give a shot on this on the bash whether you are using Linux or Git terminal
chmod +x mvnw
```
```bash
# And then run it again
./mvnw spring-boot:run
```
## Endpoints
### For this section, I recommend you installing Bruno or Postman to test all the endpoints of the project
#### Spring Boot runs locally on port 8080 for default, make sure to insert htttp://localhost:8080/ on the value bar in any API tester you are using

##### GET parameter
* **/users/{id}**: Search any user information by id
* **/orders/{id}**: Returns any orders related to any user by id
* **/categories/{id}**: List categories of products by product id
* **/products/{id}**: List which products are stored by id

###### Atention: for POST and PUT parameters, make sure to place the JSON body of the request in "Body" section of your API tester
###### For DELETE, don't forget that the database maintains the integrity of the data, so delete first any entity related to the entity id

## H2 Database
### This project works on a memory database called H2, I suggest you using it than trying to connect with any relational database because it is easier to connect
* To do that, click on this link: https://localhost:8080/h2-console
#### On your screen, it'll be shown this:
<img width="481" height="337" alt="h2-console image" src="https://github.com/user-attachments/assets/40d556fd-d494-4228-8ed7-e2019e7eb09f" />

#### Type the same information shown in the picture on the boxes in your h2 console, and then click "Connect"

* You can now see all the tables and schemas present in the project's database, and also view its attributes better by just selecting any of the TB_EXAMPLE and then pressing "Run" button box

## Special thanks
I owe this thanks to https://www.youtube.com/devsuperior for teaching me the basics of Spring Boot framework and understanding the HTTP protocol and its responses, this is my first "big" project, and I hope I leveling up even more on Java ☕🚀
