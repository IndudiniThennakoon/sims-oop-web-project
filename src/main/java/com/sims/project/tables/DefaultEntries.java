/**
 * 
 */
package com.sims.project.tables;

import java.sql.SQLException;
import java.sql.Statement;

/**
*
* @author maneesh
*/
public class DefaultEntries {
	
	/**
	 * 		@do Create new execute tables functions below
	 * 		@do And make new class instance in InsertDefaultEntries class -> executeEntries() method
	 */
	
	public static void usersTableEntries(Statement stmt) throws SQLException {
        
        stmt.executeUpdate("INSERT INTO users"
        		+ "(id, name, email, password, nic, profile_photo, user_type, email_verified, email_verify_code, password_reset_code, created_at, updated_at) "
                + "VALUES(1, 'Admin', 'admin@hims.lk', '12345678', NULL, NULL, 'admin', 0, NULL, NULL, '2022-05-22 23:19:45', '2022-05-23 20:19:45')");
        
        stmt.executeUpdate("INSERT INTO users"
        		+ "(id, name, email, password, nic, profile_photo, user_type, email_verified, email_verify_code, password_reset_code, created_at, updated_at) "
                + "VALUES(2, 'Agent', 'agent@hims.lk', '12345678', NULL, NULL, 'agent', 0, NULL, NULL, '2022-05-22 23:20:08', '2022-05-23 20:19:45')");
		
	}
	
	public static void ___TableEntries(Statement stmt) throws SQLException {
		//Example block
	}

}
