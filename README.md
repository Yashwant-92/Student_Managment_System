Student Management System

A Beginner-level Java console-based project built with Maven, Core Java, JDBC, and MySQL. This project helps you learn basic CRUD operations (Create, Read, Update, Delete) on student records stored in a MySQL database.

🚀 Project Summary

•	- Add new students

•	- View all student records

•	- View a student by ID or Name

•	- Update student information

•	- Delete student records

🛠️ Tech Stack

•	Java - Core Java (JDK 17 or above)

•	JDBC - Java Database Connectivity

•	MySQL - Database for storing data

•	Maven - Project build management

📁 Project Structure

•	StudentManagementSystem/

•	├── src/main/java/com/example/

•	│   ├── DAO/

•	│   │   ├── StudentInterface.java

•	│   │   └── StudentInterfaceImpl.java

•	│   ├── Model/Student.java

•	│   ├── Services/StudentServices.java

•	│   ├── Utility/StudentUtility.java

•	│   └── Main/MainClass.java

•	├── resources/

•	│   └── application.properties (optional)

•	├── pom.xml

•	└── README.md

🔧 How to Run the Project
•	1. Prerequisites: JDK 17+, MySQL, Maven
•	2. Clone the Project: git clone <repository-url>
•	3. Create Database:
•	   CREATE DATABASE IF NOT EXISTS libraryDB;
•	   USE libraryDB;
•	   CREATE TABLE IF NOT EXISTS student (id INT PRIMARY KEY, name VARCHAR(100), address VARCHAR(150), mono BIGINT, rollno BIGINT);
•	4. Update DB credentials in StudentUtility.java
•	5. Run MainClass.java from your IDE

🎯 Features
•	- Add, update, delete student records
•	- View by ID or name
•	- View all students
•	- Console-based UI
•	- Automatic DB/table creation

💡 Sample Student Fields
•	id - int - Unique student ID
•	name - String - Full name
•	address - String - Address
•	mono - long - Mobile number
•	rollno - long - Academic roll number
📷 Sample Console Output

•	========= STUDENT MANAGEMENT =========
•	1. Add Student
•	2. View All Students
•	3. View Student by ID
•	4. View Student by Name
•	5. Update Student by ID
•	6. Delete Student by ID
•	7. Exit

•	Enter your choice:
📚 Learning Outcome
•	- Understand JDBC CRUD operations
•	- Learn layered structure (Model → DAO → Service)
•	- Use Maven for Java apps

📌 Notes
•	- Console-based
•	- Beginner-friendly
•	- Upgradable to GUI or Spring Boot

📜 License
•	This project is for educational purposes only.

🙋‍♂️ Author
•	Your Name
•	Java Developer | MCA Student | Enthusiastic Coder
