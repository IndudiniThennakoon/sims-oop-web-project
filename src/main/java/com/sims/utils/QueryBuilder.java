/**
 * 
 */
package com.sims.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * This is the Query Builder class
 * 
 * - CRUD Operations
 * - Create = @createData | Read = @readData | Update = @updateData | Delete = @deleteData
 * 
 * @author maneesh
 */

public class QueryBuilder {
	
	public static ResultSet createData(Connection con, String query) {
		return null;
		
	}
	
	public static ResultSet readData(Connection con, String query) {
        Statement stmt = null;
        ResultSet rSet = null;  
        try {
            stmt = con.createStatement();
            rSet = stmt.executeQuery(query);
            return rSet;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
	
	public static ResultSet updateData(Connection con, String query) {
		return null;
		
	}
	
	public static ResultSet deleteData(Connection con, String query) {
		return null;
		
	}

}
