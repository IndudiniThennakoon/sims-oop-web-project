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
public class GradesTable {
	
    public GradesTable(Statement stmt) throws SQLException {
    	
    	String tableName = "grades";
    	
        try {
            stmt.executeUpdate(
                  " CREATE TABLE IF NOT EXISTS " + tableName + "("
                  + " id int(11) unsigned NOT NULL AUTO_INCREMENT, "
                  + " title varchar(255) NOT NULL, "
                  + " created_at datetime DEFAULT current_timestamp(), "
                  + " updated_at datetime DEFAULT current_timestamp(), "
                  + " PRIMARY KEY (id) "
                  + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4"
            );
            
            
            System.out.println(tableName + " table created successfully.!");
            
        } catch (SQLException e) {
        	e.printStackTrace();
            throw e;
            
        }
        
    }

}
