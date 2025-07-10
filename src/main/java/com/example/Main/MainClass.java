package com.example.Main;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.example.DAO.StudentInterfaceImpl;
import com.example.Model.Student;
import com.example.Utility.StudentUtility;

public class MainClass {

    public static void main(String[] args) throws SQLException {

        StudentInterfaceImpl studentDAO = new StudentInterfaceImpl();

        // Create database and table if not exists
        String query1 = "CREATE DATABASE IF NOT EXISTS StudentMS";
        String query2 = "USE StudentMS";
        String query3 = "CREATE TABLE IF NOT EXISTS student (" +
                        "id INT PRIMARY KEY, " +
                        "name VARCHAR(100), " +
                        "address VARCHAR(150), " +
                        "mono BIGINT, " +
                        "rollno BIGINT)";

        Statement stmt = StudentUtility.getConnection().createStatement();
        stmt.execute(query1);
        System.out.println("✅ Database created (or exists)");

        stmt.execute(query2);
        System.out.println("📁 Using database: libraryDB");

        stmt.execute(query3);
        System.out.println("✅ Table created (or exists)");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n========= STUDENT MANAGEMENT =========");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. View Student by ID");
            System.out.println("4. View Student by Name");
            System.out.println("5. Update Student by ID");
            System.out.println("6. Delete Student by ID");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // buffer clear

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();

                    System.out.print("Enter Mobile Number: ");
                    long mono = sc.nextLong();

                    System.out.print("Enter Roll No: ");
                    long rollno = sc.nextLong();

                    Student newStudent = new Student(id, name, address, mono, rollno);
                    studentDAO.addStudent(newStudent);
                    break;

                case 2:
                    List<Student> students = studentDAO.getAllStudents();
                    for (Student s : students) {
                        System.out.println(s);
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    studentDAO.getStudentById(searchId);
                    break;

                case 4:
                    System.out.print("Enter Name to search: ");
                    String searchName = sc.nextLine();
                    studentDAO.getStudnetByName(searchName);
                    break;

                case 5:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String uname = sc.nextLine();

                    System.out.print("Enter New Address: ");
                    String uaddress = sc.nextLine();

                    System.out.print("Enter New Mobile No: ");
                    long umono = sc.nextLong();

                    System.out.print("Enter New Roll No: ");
                    long urollno = sc.nextLong();

                    Student updateStudent = new Student(uid, uname, uaddress, umono, urollno);
                    studentDAO.updateStudentById(updateStudent);
                    System.out.println("✅ Student updated.");
                    break;

                case 6:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();
                    studentDAO.deleteStudent(deleteId);
                    break;

                case 7:
                    System.out.println("👋 Exiting... Thank you!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("❌ Invalid choice, try again.");
            }
        }
    }
}
