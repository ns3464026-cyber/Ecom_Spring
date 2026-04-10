🛒 E-Commerce Backend (Spring Boot)
A backend REST API for an E-Commerce application built using Spring Boot MVC architecture. This project demonstrates how to design scalable backend services using modern Java technologies.
🚀 Tech Stack
Java
Spring Boot (MVC)
Spring Data JPA
PostgreSQL
Postman (API Testing)
DTO Pattern (Data Transfer Object)
📌 Features
📦 Product Management (Create, Update, Delete, Fetch)
🧾 Order Management System
🔄 DTO-based data transfer (clean architecture)
🗄️ Database integration with PostgreSQL
🌐 RESTful API design
🧪 API testing using Postman
🏗️ Project Structure
src/main/java/com/example/SpringEcom
│
├── controller     → Handles API requests
├── service        → Business logic
├── repo           → Database interaction (JPA)
├── model          → Entity classes
│   └── dto        → Request & Response DTOs
⚙️ API Endpoints
🛍️ Product APIs
POST /product → Add new product
PUT /product/{id} → Update product
DELETE /product/{id} → Delete product
GET /products → Get all products
📦 Order APIs
POST /orders/place → Place order
GET /orders → Get all orders
🧪 API Testing
All APIs are tested using Postman.
Postman helps simulate client requests and verify server responses without a frontend.
🗄️ Database Configuration
Make sure PostgreSQL is running and update your application.properties:
spring.datasource.url=jdbc:postgresql://localhost:5432/your_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
▶️ How to Run
Clone the repository
git clone https://github.com/your-username/your-repo-name.git
Open in IDE (IntelliJ / VS Code)
Configure PostgreSQL database
Run the application:
SpringEcomApplication.java
Test APIs using Postman
💡 Learning Highlights
Understanding of REST API development
Hands-on with Spring Boot & JPA
Implementation of DTO pattern
Experience with real-world backend structure
API testing and debugging using Postman
📌 Future Improvements
Add Authentication (JWT / Spring Security)
Implement Pagination & Sorting
Add Swagger for API documentation
Deploy on cloud (AWS / Render)
🤝 Contributing
Feel free to fork this repository and improve it. Suggestions are welcome!
📬 Contact
If you have any questions or suggestions, feel free to connect.
