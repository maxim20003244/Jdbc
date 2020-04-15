package JdbcDriver;

import java.sql.*;

public class Driver {

	private static final String URL = "jdbc:mysql://localhost:3306/school?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection connection = null;

			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			if (!connection.isClosed()) {
				System.out.println("Connection whith DataBasses established!");
			}

			
			   connection.close();
			  
			  if(connection.isClosed()) { 
				  System.out.println("Connection is closed!");
			  }
			 

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failed to load class driver");

		}
	}

}
