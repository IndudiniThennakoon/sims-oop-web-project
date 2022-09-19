/**
 * 
 */
package com.sims.services;

import java.sql.Connection;
import java.sql.ResultSet;

import com.sims.configs.ConnectionProvider;
import com.sims.models.User;
import com.sims.services.interfaces.UserServiceInterface;
import com.sims.utils.QueryBuilder;
import com.sims.utils.ModelHelper;

/**
 * This is the User Service class
 * 
 * @author maneesh
 */
public class UserService implements UserServiceInterface {

	@Override
	public User getUserByEmail(String email) {
		
		User user = null;
		Connection con = null;
		
		try {
	        con = ConnectionProvider.getConnection();
			ResultSet rSet = QueryBuilder.readData(con, "SELECT * FROM users WHERE email='"+email+"'");
			
			if (rSet != null) {
				User newUser = ModelHelper.mapResultSetToUser(rSet);
				user = newUser;
			}
			ConnectionProvider.close(con);

		} catch (Exception e) {
            e.printStackTrace();
        }
				
		return user;
	}
	
}
