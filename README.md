# ResuMint 🚀  
### Smart Resume Builder Platform

ResuMint is a modern, full-stack SaaS application that enables users to build professional resumes, securely authenticate, make payments, and download high-quality PDF resumes.  
The platform is built using **React** and **Spring Boot**, with **JWT-based authentication** and **Razorpay payment integration**, following real-world production practices.

---

## 📌 Overview

Creating a professional resume should be simple, secure, and accessible.  
ResuMint solves this by providing an intuitive resume-building experience with premium features such as PDF downloads and secure payments.

This project demonstrates:
- Full-stack application architecture
- Secure authentication & authorization
- Payment gateway integration
- Server-side PDF generation
- Clean, scalable backend design

---

## ✨ Features

### 🔐 Authentication & Security
- User registration and login
- JWT-based authentication
- Protected REST APIs
- Secure token validation

### 📝 Resume Builder
- Dynamic resume creation
- Editable sections (Education, Skills, Experience, Projects, etc.)
- Real-time preview

### 💳 Payments (Razorpay)
- Secure payment gateway integration
- Order creation and verification
- Premium feature unlocking after payment

### 📄 PDF Generation
- Download resumes in professional PDF format
- Print-ready layout
- Consistent formatting

### 👤 User Dashboard
- Manage resumes
- View payment status
- Download purchased resumes

---

## 🛠️ Tech Stack

### Frontend
- ⚛️ React
- 🎨 Material UI / CSS
- 🔄 Axios
- 🔐 JWT handling

### Backend
- ☕ Spring Boot
- 🔐 Spring Security + JWT
- 🗄️ MongoDB / MySQL
- 💳 Razorpay Payment Gateway
- 📄 PDF generation (iText / OpenPDF)

---

## 🧩 Architecture

**ResuMint follows a layered architecture:**

**Controller → Service → Repository → Database**

- **Controller Layer**: Handles REST API requests
- **Service Layer**: Business logic
- **Repository Layer**: Database interactions
- **Security Layer**: JWT validation & authorization

---

## 📂 Project Structure

ResuMint/
│
├── frontend/ # React application
│ ├── components/
│ ├── pages/
│ ├── services/
│ ├── hooks/
│ └── utils/
│
├── backend/ # Spring Boot application
│ ├── controller/
│ ├── service/
│ ├── repository/
│ ├── security/
│ ├── model/
│ ├── dto/
│ ├── config/
│ └── exception/
│
└── README.md

**🚀 Getting Started**
**Prerequisites**
Java 17+
Maven
MongoDB

**Run Backend**
cd backend
mvn clean install
mvn spring-boot:run

**Backend will start at:**
http://localhost:8080

**Run Frontend**
cd frontend
npm install
npm start

**Frontend will start at:**
http://localhost:3000

**🔐 Authentication Flow**

User registers or logs in
Backend generates JWT
JWT is returned to frontend
Frontend sends JWT in Authorization header
Spring Security validates token for secured endpoints

**💳 Payment Flow (Razorpay)**

User selects premium resume download
Backend creates Razorpay order
Frontend completes payment
Backend verifies payment signature
PDF download is enabled

**🧪 API Highlights**

POST /auth/register – Register user
POST /auth/login – Authenticate user
POST /payment/create-order – Create Razorpay order
POST /payment/verify – Verify payment
GET /resume/download – Download resume PDF

**📈 Future Enhancements**

Multiple resume templates
Resume sharing via public links
Admin dashboard & analytics
Email resume delivery
AI-powered resume suggestions
Subscription-based plans


=======
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

http://localhost:8080/swagger-ui.html
or
http://localhost:8080/swagger-ui/index.html

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

**Configure database in application.properties**

spring.datasource.url=jdbc:mysql://localhost:3306/resumint
spring.datasource.username=root
spring.datasource.password=yourpassword

**Run the application**
mvn spring-boot:run

**🔮 Future Enhancements**
AI-powered resume suggestions
Resume PDF export
Admin dashboard
Role-based access control (Admin/User)
Frontend integration (React / Angular)

**🤝 Contribution**
Contributions are welcome!
Feel free to fork the repository and submit a pull request.
>>>>>>> 118ad10250afe13953a02435402eaeeb27225072
