package com.example.DAO;

import java.sql.SQLException;
import java.util.List;

import com.example.Model.Student;

public interface StudentInterface {

	public void addStudent(Student student) throws SQLException; // Addstudent;

	List<Student> getAllStudents() throws SQLException; // Listofstudents;

	public void getStudentById(int id) throws SQLException; // getStudentbyid;

	public void getStudnetByName(String name) throws SQLException; // getStudentbyname;

	public void updateStudentById(Student student) throws SQLException; // update Student by name

	public void deleteStudent(int id) throws SQLException; // deleteStudentById;

}
