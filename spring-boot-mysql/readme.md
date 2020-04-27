## spring-boot-mysql


### Project Info

- This is a Spring Boot starter project where MySQL is used as database.
- Gradle is used as build too.
- Hibernate as ORM.
- Spring Data to support repository layer.
- No view template used.

### Project Commands

- We have two docker-compose configuration file in the project root
        
    - docker-compose.yml - for development use
    - docker-compose-production.ytml - for deployment purpose
    
- Go to project root and use **docker-compose up** command. It will start a MySQL container with given configuration. Container MySQL will mapped to host's 3307 port which is used in this application's properties file.

- Run the project from IDE or **gradlew bootRun** command.

- Try "localhost:8080/users" in browser or postman. It should return empty.

- Now fill everything up.

