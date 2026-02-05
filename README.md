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

* Java Development Kit (JDK) is installed and properly configured in your system's PATH.
* You have a Spring Boot project with all necessary dependencies.
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
## As you are in the project's path, you now may execute
$ mvn spring-boot:run
```
