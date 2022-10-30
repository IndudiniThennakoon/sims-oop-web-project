/**
 * 
 */
package com.sims.project.tables;

import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author navod
 */
public class LeaveRequestTable {
	
    public LeaveRequestTable(Statement stmt) throws SQLException {
    	
    	String tableName = "leave_requests";
    	
        try {
            stmt.executeUpdate(
                    "CREATE TABLE `leave_requests` ("
                    + " `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,"
                    + " `user_id` bigint(20) unsigned NOT NULL,"
                    + " `date` date NOT NULL,"
                    + " `days_count` int(11) NOT NULL,"
                    + " `reason` text DEFAULT NULL,"
                    + " `cancel_reason` text DEFAULT NULL,"
                    + " `status` enum('pending','accepted','rejected','cancelled') NOT NULL,"
                    + " `requested_at` datetime DEFAULT current_timestamp(),"
                    + " `created_at` datetime NOT NULL DEFAULT current_timestamp(),"
                    + " `updated_at` datetime NOT NULL DEFAULT current_timestamp(),"
                    + " PRIMARY KEY (`id`)"
                    + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4"
            );
            
            System.out.println(tableName + " table created successfully.!");
            
        } catch (SQLException e) {
        	e.printStackTrace();
            throw e;
            
        }
        
    }

}
