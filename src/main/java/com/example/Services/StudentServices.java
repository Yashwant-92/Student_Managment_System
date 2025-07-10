package com.example.Services;

import java.sql.SQLException;
import java.util.List;

import com.example.DAO.StudentInterfaceImpl;
import com.example.Model.Student;

public class StudentServices {

	StudentInterfaceImpl studentInterfaceImpl = new StudentInterfaceImpl();

	public void addStudent(Student student) throws SQLException {
		studentInterfaceImpl.addStudent(student);
	}

	public void getStudentById(int id) throws SQLException {
		studentInterfaceImpl.getStudentById(id);
	}

	public void getStudentByName(String name) throws SQLException {
		studentInterfaceImpl.getStudnetByName(name);
	}

	public void deleteStudentById(int id) throws SQLException {
		studentInterfaceImpl.deleteStudent(id);
	}

	public List<Student> getAllStudents() throws SQLException {
		return studentInterfaceImpl.getAllStudents();

	}
}
