package com.nt.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static  Connection con;
	private static final String DRIVER_NAME="oracle.jdbc.driver.OracleDriver";
	private static final String URL="jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String USERNAME="system";
	private static final String PASSWORD="916776";
	
	private ConnectionManager() {}
	
	static {
		try {
			Class.forName(DRIVER_NAME);
			if(con==null)
				con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static Connection getConnection() {
		return con;
	}
	
}
