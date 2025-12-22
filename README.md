# 🎓 CampusConnect - User Management Subsystem

---

## 📌 Project Overview
CampusConnect is a university management system designed to streamline student interactions. This repository contains the User Management Subsystem, which handles core functionalities such as student registration, authentication, and profile management.

The project is built using Java and follows a robust architectural design to ensure scalability and maintainability.

---

## ✨ Key Features
* User Registration: Allows new students to create profiles with detailed information.
* Authentication (Login): A secure login gateway for existing students.
* Profile Management: Functionality to update student profile data dynamically through the modifyProfile method.
* Interactive UI: A desktop interface built with Java Swing.

---

## 🏗️ Architectural Design

### 1. MVC Pattern (Model-View-Controller)
* Models: Data structures (e.g., Student class).
* Views (Boundaries): UI components such as the LoginScreen.
* Controllers: The logic layer that processes data (e.g., UserControl).

### 2. SOLID Principles
* Dependency Inversion: The controller depends on an abstraction (IStudentRepository).
* Single Responsibility: Each class has one clear purpose (e.g., data retrieval via specific getters).

---

## 📊 Documentation & Diagrams
The implementation is strictly mapped to the system's design documents:
* Class Diagram: Defines the static structure and relationships.
* Sequence Diagram: Illustrates the dynamic flow of data during Login and Registration.

---

## 🛠️ Tech Stack
* Language: Java 
* UI Framework: Java Swing
* IDE: Eclipse IDE

---

## 🚀 How to Run
1. Clone the repository.
2. Import to IDE: Open the project in Eclipse or any Java IDE.
3. Run Application: Execute the MainApp.java file. The console will confirm "System is running".

---

## 👥 Team Members

| Student ID | Name | Email |
| :--- | :--- | :--- |
| 20242148 | Sara Ali Refaey Abdelhamed (Lead) | 20242148@stud.fci-cu.edu.eg |
| 20242048 | Alaa Khaled Kamel | 20242048@stud.fci-cu.edu.eg |
| 20242116 | Dalia Samy Abd El-Aziz | 20242116@stud.fci-cu.edu.eg |
| 20242150 | Sarah Mohamed Salah El-Din | 20242150@stud.fci-cu.edu.eg |
| 20242101 | Habiba Abdullah Ahmed | 20242101@stud.fci-cu.edu.eg |

---
