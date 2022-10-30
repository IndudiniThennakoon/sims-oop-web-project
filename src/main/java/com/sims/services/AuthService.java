/**
 * 
 */
package com.sims.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.mindrot.jbcrypt.BCrypt;

import com.sims.configs.ConnectionProvider;
import com.sims.models.User;
import com.sims.services.interfaces.AuthServiceInterface;
import com.sims.utils.QueryBuilder;

/**
 * This is the Auth Service class
 * 
 * @author maneesh
 */
public class AuthService implements AuthServiceInterface {
	
	@Override
	public List<User> userLoginByEmail(String email, String password) {
		
		ArrayList<User> user = new ArrayList<>();
		Connection con = null;
		String emailUserPassword = null;
		int userId = 0;
		
		try {
	        con = ConnectionProvider.getConnection();
			ResultSet rSet = QueryBuilder.readData(con, "SELECT * FROM users WHERE email='"+email+"'");
			
			if (rSet != null) {
				
				if (rSet.next()) {
				    userId = rSet.getInt(1);
					emailUserPassword = rSet.getString(4);
				}
				
				if (emailUserPassword != null && BCrypt.checkpw(password, emailUserPassword)) {
					User newUser = new User(userId);
					user.add(newUser);
				}
			}
			ConnectionProvider.close(con);

		} catch (Exception e) {
            e.printStackTrace();
        }
		
		return user;
	}

}
