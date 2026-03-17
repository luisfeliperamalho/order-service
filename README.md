# 🧾 Order Service

A robust and scalable backend service for order management, built with **Java 21 + Spring Boot**, applying **Clean Architecture** and **Domain-Driven Design (DDD)** principles.

---

## 📌 Overview

This project demonstrates how to design and implement a backend service with a strong separation of concerns, focusing on **maintainability**, **testability**, and **scalability**.

The system exposes RESTful endpoints to manage orders and persists data using PostgreSQL.

---

## 🏗️ Architecture

The project is structured following **Clean Architecture**, ensuring that business rules remain independent from frameworks and external concerns.

```
src/main/java/com/luisdev/orderservice
│
├── application       # Use cases (business flows)
│   ├── dto
│   └── usecase
│
├── domain            # Core business logic
│   ├── entity
│   └── repository
│
├── infrastructure    # External concerns
│   ├── controller
│   ├── persistence
│   │   ├── entity
│   │   ├── repository
│   │   └── mapper
│   └── config
│
└── shared            # Shared components (mappers, utils)
```

### 🔥 Key Design Decisions

* **Dependency inversion**: domain does not depend on frameworks
* **Use case isolation**: each business operation is encapsulated
* **Layered responsibility**: clear separation between API, domain, and persistence
* **Mapping layer**: decouples domain entities from persistence models

---

## 🚀 Tech Stack

* Java 21
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Docker
* Maven

---

## 🔌 API

### ➕ Create Order

```
POST /orders
```

#### Request

```json
{
  "description": "New order",
  "amount": 150.0
}
```

#### Response

```json
{
  "id": 1,
  "description": "New order",
  "amount": 150.0
}
```

---

## 🐳 Running with Docker

```bash
docker-compose up -d
```

This will start:

* PostgreSQL database
* Supporting services (if configured)

---

## ▶️ Running Locally

```bash
./mvnw spring-boot:run
```

Application will be available at:

```
http://localhost:8080
```

---

## 🧪 Future Improvements

* ✅ Input validation (Bean Validation)
* 🔐 Authentication & Authorization (JWT)
* 🧪 Unit and integration tests
* 📊 Observability (logs, metrics)
* 📄 API documentation (OpenAPI / Swagger)
* 🚀 CI/CD pipeline

---

## 📚 What This Project Demonstrates

* Practical application of **Clean Architecture**
* Use of **DDD concepts in a real backend**
* REST API design with Spring Boot
* Integration with relational databases using JPA
* Separation between domain and infrastructure layers

---

## 👨‍💻 Author

**Luis Felipe Ramalho Oliveira**

Backend Developer focused on building scalable and maintainable systems.

---

## ⭐ Final Notes

This project is part of my journey to deepen my expertise in backend development and software architecture, aiming to build production-ready systems aligned with industry best practices.
