package com.programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class PreparedStatementAPI {
	static {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

		}

		catch (ClassNotFoundException e) {

			e.printStackTrace();

		}

	}

	public static void main(String[] args) {

		Connection conn = null;

		Statement stmt = null;
		PreparedStatement ps = null;

		ResultSet rs = null;

		try {

			String dbURL = "jdbc:mysql://localhost:3306/hplus?user=root&password=YhD7eimrvh";

			conn = DriverManager.getConnection(dbURL);

			if (conn != null) {

				System.out.println("Connection establised using connection");
}
			String query = "UPDATE emp_tab set name = ? WHERE empno = ?";
			ps = conn.prepareStatement(query);
			ps.setString(1,"Shreya");
			ps.setInt(2,7002);
			int rows = ps.executeUpdate();
			
			if(rows!=0) System.out.println("Update completed Successfully");
			else System.out.println("Could not Update completed Successfully");
			
			String selectQuery = "SELECT * from emp_tab WHERE empno = ?";
			ps = conn.prepareStatement(selectQuery);
			ps.setInt(1,7001);
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}