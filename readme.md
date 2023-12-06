This is a simple RESTful API for managing a library system, implemented using Java with Spring Boot and PostgreSQL.

Prerequisites
Before running the application, ensure that you have the following:

Java JDK installed (version 8 or higher)
PostgreSQL installed and running
Postman or any API testing tool for testing the endpoints
Configuration
Clone the repository to your local machine:

bash
Copy code
git clone https://github.com/your-username/library-management-api.git
Open the project in your favorite Java IDE.

Configure your PostgreSQL database connection in src/main/resources/application.properties. Modify the following properties:

properties
Copy code
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
Replace your_database_name, your_username, and your_password with your PostgreSQL database details.

Run the Application
Build the project:

bash
Copy code
./mvnw clean install
or if you're using Windows:

bash
Copy code
mvnw clean install
Run the application:

bash
Copy code
./mvnw spring-boot:run
or on Windows:

bash
Copy code
mvnw spring-boot:run
The application will start, and you should see log messages indicating that the server is running.

Test Endpoints
Use Postman or any API testing tool to test the three endpoints:

Retrieve All Books (GET /api/books)
Add a New Book (POST /api/books)
Request Body (JSON): {"title": "Sample Book", "author": "Sample Author"}
Update Book Details (PUT /api/books/{id})
Request Body (JSON): Updated book details
Seeding the Database with Mock Data
To be added

API Documentation
1. Retrieve All Books
Endpoint: GET /api/books
Description: Retrieve a list of all books in the library.
Response:
json
Copy code
[
  {"id": 1, "title": "Book 1", "author": "Author 1"},
  {"id": 2, "title": "Book 2", "author": "Author 2"},
  // ...
]
2. Add a New Book
Endpoint: POST /api/books
Description: Add a new book to the library.
Request Body:
json
Copy code
{"title": "New Book", "author": "New Author"}
Response:
json
Copy code
{"id": 3, "title": "New Book", "author": "New Author"}
3. Update Book Details
Endpoint: PUT /api/books/{id}
Description: Update details of a specific book.
Request Body:
json
Copy code
{"title": "Updated Book", "author": "Updated Author"}
Response:
json
Copy code
{"id": 3, "title": "Updated Book", "author": "Updated Author"}
