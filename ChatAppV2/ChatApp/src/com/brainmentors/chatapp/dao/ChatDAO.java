package com.brainmentors.chatapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.brainmentors.chatapp.utils.ConfigReader.getValue;

public class ChatDAO {
	
	public Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName(getValue("DRIVER"));
		
		final String CONNECTION_STRING = getValue("CONNECTION_URL");
		final String USER_ID = getValue("USER_ID");
		final String PASSWORD = getValue("PASSWORD");
		Connection con = DriverManager.getConnection(CONNECTION_STRING, USER_ID, PASSWORD);
		if(con != null) {
			System.out.println("Connection created...");
			con.close();
		}
		
		return null;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ChatDAO dao = new ChatDAO();
		dao.createConnection();
	}

}
