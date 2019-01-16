package com.traineeatjava.ltiday7;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBInfo {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			//Step 1: Loading the JDBC Driver
			Class.forName("oracle.jdbc.driver.OracleDriver"); //TODO: Reflection API
			//Step 2: Try connecting the database
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pass = "hr";
			conn = DriverManager.getConnection(url, user, pass);
			DatabaseMetaData dbms = conn.getMetaData();
			System.out.println("DB Name: " + dbms.getDatabaseProductName());
			System.out.println("DB Version: " + dbms.getDatabaseProductVersion());
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println("Please check if driver jar is present in the classpath");
		}
		catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		finally {
			try { conn.close(); } catch (Exception ignored) { }
		}
	}
}
