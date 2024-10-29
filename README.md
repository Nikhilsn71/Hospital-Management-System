# Hospital Management System
- Developed a Spring Boot application to manage doctor and patient information with a RESTful API.
- Designed and implemented endpoints for creating, retrieving, Updating and deleting records for doctors and patients.
- Used JPA to map relational database tables, enabling efficient CRUD operations.
- Integrated exception handling for invalid data retrieval using custom exceptions.

## Technologies Used

*Backend Framework:* `` Spring Boot `` <br>
<br>
*Database:* ` MySQL ` <br>
<br>
*REST Client:* ` Postman ` <br>
<br>
*Testing:* ` JUnit 5 ` <br>
<br>
*Tools:* ` Maven ` <br>

## Dependencies
~~~
<dependencies>

  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
  </dependency>

  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
  </dependency>

  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
    <optional>true</optional>
  </dependency>

  <dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <scope>runtime</scope>
  </dependency>

  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
  </dependency>

<dependencies>
~~~

## API Endpoints

### Doctor Endpoints

| Method | Endpoint               | Description                    |
|--------|------------------------|--------------------------------|
| POST   | `/api/adddoctor`      | Add a new doctor               |
| GET    | `/api/getAllDoctors`   |Get all doctors           |
| POST    | `/api/assignment/{docId}/{patId}` | Assign Patient to Doctor       |


### Patient Endpoints

| Method | Endpoint                  | Description                    |
|--------|---------------------------|--------------------------------|
| POST   | `/api/addpatient`    | Add a new patient              |
| GET    | `/api/getAllPatients`    | Get all patients          |
| PUT    | `/api/updatePatientById/{id}`    | Update patient details          |
| GET    | `/api/getPatientById/{id}` | Get patient by ID      |
| DELETE    | `api/deletePatientById/{id}` | Delete patient by ID      |


## Database Configuration

The application is configured to use MySQL as the default database. You can change the database by updating the connection properties in `application.properties`.

#### Example MySQL configuration:
~~~
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
~~~
