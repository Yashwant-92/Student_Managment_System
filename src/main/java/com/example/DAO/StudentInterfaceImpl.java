package com.example.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import com.example.Model.Student;
import com.example.Utility.StudentUtility;

public class StudentInterfaceImpl implements StudentInterface {

	public void addStudent(Student student) throws SQLException {
		String query = "Insert into student (id, name, address, mono, rollno)values (?,?,?,?,?)";
		PreparedStatement stmt = StudentUtility.getConnection().prepareStatement(query);
		stmt.setInt(1, student.getId());
		stmt.setString(2, student.getName());
		stmt.setString(3, student.getAddress());
		stmt.setLong(4, student.getMono());
		stmt.setLong(5, student.getRollno());

		stmt.executeUpdate();
		System.out.println("Student Added Succesfully...");
		stmt.close();
	}

	public List<Student> getAllStudents() throws SQLException {
		List<Student> student = new ArrayList<Student>();
		String query = "Select * from student";
		Statement stmt = StudentUtility.getConnection().createStatement();
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String address = rs.getString("address");
			long mono = rs.getLong("mono");
			long rollno = rs.getLong("rollno");

			student.add(new Student(id, name, address, mono, rollno));
		}
		stmt.close();
		rs.close();
		return student;
	}

	public void getStudentById(int id) throws SQLException {
		String query = "SELECT * from student where id = ?";
		PreparedStatement stmt = StudentUtility.getConnection().prepareStatement(query);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			System.out.println("Student Found ...");
			int id1 = rs.getInt("id");
			String name = rs.getString("name");
			String address = rs.getString("address");
			long mono = rs.getLong("mono");
			long rollno = rs.getLong("rollno");
			System.out.println("id  = " + id1 + " name = "+name+ " address = " + address + " mono = " + mono + " = " +  "rollno = "+rollno);
			rs.close();
			stmt.close();
		} else {
			System.out.println("Studnt not found..");
		}
	}

	public void getStudnetByName(String name) throws SQLException {
		String query = "Select * from student where name = ?";
		PreparedStatement stmt = StudentUtility.getConnection().prepareStatement(query);
		stmt.setString(1, name);
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			System.out.println("Student found....");
			int id = rs.getInt("id");
			String name1 = rs.getString("name");
			String address = rs.getString("address");
			long mono = rs.getLong("mono");
			long rollno = rs.getLong("rollno");

			System.out.println("id  = " + id + " name = "+name1+ " address = " + address + " mono = " + mono + " = " +  "rollno = "+rollno);
			rs.close();
			stmt.close();
		} else {
			System.out.println("Student not found...");
		}

	}

	public void updateStudentById(Student student) throws SQLException {

		String query = "UPDATE student SET name = ?, address = ?, mono = ?, rollno = ? WHERE id = ?";
		PreparedStatement stmt = StudentUtility.getConnection().prepareStatement(query);
		stmt.setString(1, student.getName());
		stmt.setString(2, student.getAddress());
		stmt.setLong(3, student.getMono());
		stmt.setLong(4, student.getRollno());
		stmt.setInt(5, student.getId());

		stmt.executeUpdate();
		stmt.close();

	}

	public void deleteStudent(int id) throws SQLException {
		String query = "delete from student where id =?";
		PreparedStatement stmt = StudentUtility.getConnection().prepareStatement(query);
		stmt.setInt(1, id);
		int rowaffect = stmt.executeUpdate();
		if (rowaffect > 0) {
			System.out.println("Student delete Succesfully....");
		} else {
			System.out.println("Student not deleted...");
		}

	}

}
