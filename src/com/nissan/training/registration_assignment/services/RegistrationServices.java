package com.nissan.training.registration_assignment.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nissan.training.registration_assignment.bean.RegistrationBean;

public class RegistrationServices {
	Connection conn = null;
	
	public void connect() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/registeration", "sa", "Admin1234");
		}catch(Exception ex) {
		
			System.out.println(ex);
		}
	}
	
	public void addUser(RegistrationBean user) {
		String query = "insert into register values(?,?)";
		
		
		try {
				PreparedStatement stmt = conn.prepareStatement(query);
				stmt.setString(1, user.getUsername());
				stmt.setString(2, user.getPassword());
				stmt.executeUpdate();
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
	}
}
