# 🚀 ResuMint – Smart Resume Builder (Backend)

ResuMint is a smart resume builder **backend application** developed using **Spring Boot**.  
It provides secure authentication, structured resume management, and scalable REST APIs that can be integrated with any frontend (React, Angular, etc.).

This project follows **clean architecture**, **industry best practices**, and is suitable for real-world production use.


## ✨ Features

- 🔐 JWT-based Authentication & Authorization
- 👤 User Registration & Login
- 📄 Create, Update, View & Delete Resumes
- 🧩 Modular Resume Sections  
  - Personal Details  
  - Education  
  - Experience  
  - Skills  
  - Projects  
- 🛡️ Spring Security Integration
- 📘 API Documentation with Swagger (Springdoc OpenAPI)
- 🗄️ Database Integration using JPA & Hibernate
- ⚙️ RESTful API Design
- 🚀 Scalable & Maintainable Codebase


## 🛠️ Tech Stack

- **Java**
- **Spring Boot**
- **Spring Security**
- **JWT (JSON Web Token)**
- **Spring Data JPA / Hibernate**
- **MONGODB**
- **Maven**
- **Swagger (OpenAPI 3)**


## 🏗️ Project Architecture

resumint-backend
│
├── controller # REST Controllers
├── service # Business Logic
├── repository # Database Access
├── model/entity # JPA Entities
├── dto # Data Transfer Objects
├── security # JWT Filters & Security Config
├── config # Application Configurations
└── exception # Global Exception Handling

## 🔐 Security

- Stateless authentication using **JWT**
- Password encryption using **BCrypt**
- Protected endpoints with role-based access
- Custom authentication entry points & filters


## 📘 API Documentation

Swagger UI is available after running the application:

https://resumint-smart-resumebuilder-production.up.railway.app/swagger-ui/index.html#/


## ⚙️ Setup & Installation

### Prerequisites
- Java 17+
- Maven
- MySQL / PostgreSQL
- IDE (IntelliJ / Eclipse)

### Steps

1. Clone the repository
git clone https://github.com/your-username/resumint-backend.git

2. Navigate to the project directory
cd resumint-backend

**Run the application**
mvn spring-boot:run
