package com.revature.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.models.P0Person;

public class P0PersonDao {
	
public P0Person insertPerson(P0Person person) {
		
		/*
		 * In practice we should NEVER EVER EVER EVER
		 * store your password in the source code. It WILL get pushed
		 * up to github, and some robot will read it and report this
		 * to their master. And they will take your resources and use your
		 * database and steal your data and overuse resources and cost
		 * you a lot of money.
		 * 
		 * We should use environment variables defined on our system
		 * and retrieved using System.getenv("key")
		 */
		
		/* JDBC has a particular format for connection URLs */
		// jdbc:db-type://url:port/database_name
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String role = "bank_project_jdbc";
		String password = "top-secret-password";
		
		try(Connection conn = DriverManager.getConnection(url, role, password)) {
//			Statement statement = conn.createStatement();
			String query = "INSERT INTO User_Table (email, pass, first_name, last_name) " +
						"VALUES (?, ?, ?, ?) RETURNING uid";
			PreparedStatement statement = conn.prepareStatement(query);
			
			statement.setString(1, person.getEmail());
			statement.setString(2, person.getPassword());
			statement.setString(3, person.getFirstName());
			statement.setString(4, person.getLastName());
			
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
