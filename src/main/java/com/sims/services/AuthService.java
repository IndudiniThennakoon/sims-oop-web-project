/**
 * 
 */
package com.sims.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sims.configs.ConnectionProvider;
import com.sims.models.User;
import com.sims.services.interfaces.AuthServiceInterface;
import com.sims.utils.QueryBuilder;
import com.sims.utils.modelHelper;

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
		
		try {
	        con = ConnectionProvider.getConnection();
			ResultSet rSet = QueryBuilder.readData(con, "SELECT * FROM users WHERE email='"+email+"' AND password='"+password+"'");
			
			if (rSet != null) {
				User newUser = modelHelper.mapResultSetToUser(rSet);
				user.add(newUser);
			}
			ConnectionProvider.close(con);

		} catch (Exception e) {
            e.printStackTrace();
        }
				
		return user;
	}

}
