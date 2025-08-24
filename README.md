project:
  title: "🎓 Student Management System"
  description: >
    A beginner-level Java console-based project built with Maven, Core Java, JDBC, and MySQL.
    This project demonstrates basic CRUD operations (Create, Read, Update, Delete) on student
    records stored in a MySQL database.

summary:
  features:
    - "➕ Add new students"
    - "📋 View all student records"
    - "🔍 View a student by ID or Name"
    - "✏️ Update student information"
    - "❌ Delete student records"

tech_stack:
  - "☕ Java – Core Java (JDK 17 or above)"
  - "🔗 JDBC – Java Database Connectivity"
  - "🗄️ MySQL – Database for storing records"
  - "📦 Maven – Build and dependency management"

project_structure: |
  StudentManagementSystem/
  ├── src/main/java/com/example/
  │   ├── DAO/
  │   │   ├── StudentInterface.java
  │   │   └── StudentInterfaceImpl.java
  │   ├── Model/Student.java
  │   ├── Services/StudentServices.java
  │   ├── Utility/StudentUtility.java
  │   └── Main/MainClass.java
  ├── resources/
  │   └── application.properties (optional)
  ├── pom.xml
  └── README.md

how_to_run:
  prerequisites:
    - "JDK 17+"
    - "MySQL"
    - "Maven"
  steps:
    - "Clone the Project: git clone <repository-url>"
    - "Create Database & Table:"
    - |
      ```sql
      CREATE DATABASE IF NOT EXISTS libraryDB;
      USE libraryDB;

      CREATE TABLE IF NOT EXISTS student (
          id INT PRIMARY KEY,
          name VARCHAR(100),
          address VARCHAR(150),
          mono BIGINT,
          rollno BIGINT
      );
      ```
    - "Update DB credentials in StudentUtility.java"
    - "Run MainClass.java from IDE"

detailed_features:
  - "➕ Add, update, delete student records"
  - "🔍 View by ID or Name"
  - "📋 View all students"
  - "🖥️ Console-based UI"
  - "🛠️ Automatic DB/table creation"

student_fields:
  id: "int - Unique student ID"
  name: "String - Full name"
  address: "String - Address"
  mono: "long - Mobile number"
  rollno: "long - Academic roll number"

console_output: |
  ========= STUDENT MANAGEMENT =========
  1. Add Student
  2. View All Students
  3. View Student by ID
  4. View Student by Name
  5. Update Student by ID
  6. Delete Student by ID
  7. Exit

  Enter your choice:

learning_outcomes:
  - "🔑 Understand JDBC CRUD operations"
  - "🏗️ Learn layered structure (Model → DAO → Service)"
  - "⚡ Use Maven for Java applications"

notes:
  - "💻 Console-based project"
  - "🧑‍🎓 Beginner-friendly"
  - "🔄 Easily upgradable to GUI or Spring Boot"

license: "📜 This project is for educational purposes only."

author:
  name: "Your Name"
  role: "Java Developer | MCA Student | Enthusiastic Coder"
