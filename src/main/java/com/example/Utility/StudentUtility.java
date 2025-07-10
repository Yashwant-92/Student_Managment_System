package com.example.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentUtility {

	public static String url = "jdbc:mysql://localhost:3306/StudentMS";
	public static String username = "root";
	public static String password = "root";

	 public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(url, username, password);
		
	}
}
