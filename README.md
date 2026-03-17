# 🧾 Order Service

A backend service for order management built with **Java + Spring Boot**, following **Clean Architecture principles**.

---

## 🚀 Technologies

* Java 21
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Docker
* Maven

---

## 🏗️ Architecture

This project follows **Clean Architecture**, separating responsibilities into layers:

```
application  → use cases
domain       → business rules
infrastructure → controllers, persistence
```

---

## 📦 Features

* Create orders
* REST API with Spring Boot
* Database persistence with PostgreSQL
* Layered architecture (Domain-driven)

---

## 🔌 API Endpoints

### Create Order

```
POST /orders
```

**Request Body:**

```json
{
  "description": "New order",
  "amount": 100.0
}
```

---

## 🐳 Running with Docker

```bash
docker-compose up -d
```

---

## ▶️ Running locally

```bash
./mvnw spring-boot:run
```

---

## 🧠 What I learned

* Clean Architecture in practice
* Dependency Injection with Spring
* REST API design
* Database integration with JPA
* Dockerized environment

---

## 📌 Next Steps

* Add validation
* Implement update/delete
* Add unit tests
* Add authentication (JWT)

---

## 👨‍💻 Author

Developed by Luis Felipe 🚀
