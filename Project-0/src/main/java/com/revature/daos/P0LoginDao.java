package com.revature.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.models.P0Person;

public class P0LoginDao {
	
public P0Person getPerson(P0Person person) {
		
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String role = "bank_project_jdbc";
		String password = "top-secret-password";
		
		try(Connection conn = DriverManager.getConnection(url, role, password)) {

			String get_query = "SELECT email, pass FROM User_Table";
			PreparedStatement statement = conn.prepareStatement(get_query);
			
//			statement.setString(1, person.getEmail());
//			statement.setString(2, person.getPassword());
//			statement.setString(3, person.getFirstName());
//			statement.setString(4, person.getLastName());
			
			((P0Person) statement).getEmail();
			((P0Person) statement).getPassword();
			
			ResultSet resultSet = statement.executeQuery();

			// first ResultSet.next() -> Returns a boolean true/false if there is a next result
			//  		and moves the cursor forward to that result. NOTE: IMPORTANT: The cursor
			// 			starts before the first result. You must call next() at least once or you
			//  		will exception.
						
			if(resultSet.next()) {
				person.setId(resultSet.getInt("uid"));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return person;
	}

}
