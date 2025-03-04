# Person Management API

## 📌 Project Overview
This project is a **RESTful API** built with **Spring Boot** for managing person records using **PostgreSQL** as the database. It supports CRUD operations (Create, Read, Update, Delete) with proper validation, exception handling, and optimized query performance.

## 🎯 Key Features & Technologies Used
- **Spring Boot 3.4.0** for rapid development.
- **Spring Data JPA** for efficient database operations.
- **Spring Boot Validation** for request validation.
- **PostgreSQL** as the relational database.
- **Lombok** to reduce boilerplate code.
- **Maven** for dependency management.
- **Exception Handling** to return meaningful error messages.
- **Transaction Management** (`@Transactional`) for data integrity.
- **Optimized Queries** using indexed search and ordered retrieval.
- **Environment Variables** for secure database configuration.

---

## 🚀 Getting Started

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/yusefellban/person-management.git
cd Person-Management-API
```

### 2️⃣ Configure PostgreSQL Database
Ensure you have **PostgreSQL** installed and running.  
Update `application.yaml` with your database credentials:
```yaml
spring:
  datasource:
    url: jdbc:postgresql://${DB_HOST:localhost}:${DB_PORT:5432}/${DB_NAME:testDB}
    username: ${DB_USER:postgres}
    password: ${DB_PASSWORD:123!}
  jpa:
    hibernate:
      ddl-auto: update
    properties:
      hibernate:
        show-sql: true
        format_sql: true
        jdbc:
          batch_size: 50
        order_inserts: true
        order_updates: true
        query:
          plan_cache_max_size: 512
```
✅ **Best Practices:**
- **Use environment variables** instead of hardcoding credentials.
- **Enable SQL logging** (`show-sql: true`) for debugging.
- **Optimize Hibernate performance** with **batching** and **caching**.
- **Use `ddl-auto: validate` in production** instead of `update` to prevent schema modifications.

### 3️⃣ Build and Run the Application
```bash
mvn clean install
mvn spring-boot:run
```

---

## 📡 API Endpoints

### ➤ **Retrieve All Persons**
```http
GET /api/persons/all
```
📌 **Response:**
```json
[
  {"id": 1, "name": "John Doe", "age": 30},
  {"id": 2, "name": "Jane Smith", "age": 25}
]
```

### ➤ **Retrieve a Person by ID**
```http
GET /api/persons/{id}
```
📌 **Response:**
```json
{"id": 1, "name": "John Doe", "age": 30}
```

### ➤ **Add a New Person**
```http
POST /api/persons/add
Content-Type: application/json
```
📌 **Request Body:**
```json
{
  "name": "Alice Brown",
  "age": 28
}
```
📌 **Response:**
```json
{"id": 3, "name": "Alice Brown", "age": 28}
```

### ➤ **Update an Existing Person**
```http
PUT /api/persons/update/{id}
Content-Type: application/json
```
📌 **Request Body:**
```json
{
  "name": "Updated Name",
  "age": 35
}
```
📌 **Response:**
```json
{"id": 1, "name": "Updated Name", "age": 35}
```

### ➤ **Delete a Person**
```http
DELETE /api/persons/delete/{id}
```
📌 **Response:**
```
Person with ID {id} has been deleted successfully.
```

---

## 🛠️ Features & Enhancements
✔️ CRUD operations with RESTful API
✔️ Exception handling for meaningful error messages
✔️ **@Valid** annotations for request validation
✔️ **Lombok** for reducing boilerplate code
✔️ Optimized database queries with **indexing and sorting**
✔️ **Transactional updates** to maintain data integrity
✔️ Secure and maintainable configuration with **environment variables**

---

## 🤝 Contributing
Feel free to fork the repository and submit a pull request! 😊

---

## 📬 Contact
For any inquiries or support, reach out to me on **[LinkedIn](https://linkedin.com/in/youssef-ellban)**.

---

💡 **Happy Coding! 🚀**

