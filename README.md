# Person Management API

## 📌 Project Description
This is a **Spring Boot REST API** for managing persons using PostgreSQL as the database. It supports CRUD operations (Create, Read, Update, Delete) with proper validation, exception handling, and optimized query performance.

## ⚙️ Tech Stack
- **Spring Boot 3.4.0**
- **Spring Data JPA**
- **Spring Boot Validation**
- **PostgreSQL**
- **Lombok**
- **Maven**

---

## 🚀 Getting Started

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/YOUR_GITHUB_USERNAME/Person-Management-API.git
cd Person-Management-API
```

### 2️⃣ Configure PostgreSQL Database
Ensure that you have **PostgreSQL** installed and running.
Update the `application.yaml` file with your database credentials:
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
- **Use environment variables** for database credentials instead of hardcoding them.
- **Enable SQL logging** (`show-sql: true`) for debugging.
- **Optimize Hibernate performance** by configuring batching and caching.
- **Use `ddl-auto: validate` in production** instead of `update` to prevent unintended schema changes.

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
✔️ Exception handling for invalid requests
✔️ **@Valid** annotations for input validation
✔️ **Lombok** for cleaner code
✔️ Optimized database queries with indexing
✔️ **Transactional updates** for data integrity
✔️ Organized and maintainable structure

---

## 🤝 Contributing
Feel free to fork the repository and submit a pull request! 😊

---


## 📬 Contact
For any inquiries or support, reach out to me on **[LinkedIn](https://linkedin.com/in/youssef-ellban)**.

---

💡 **Happy Coding! 🚀**

