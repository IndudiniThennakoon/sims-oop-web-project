/**
 * 
 */
package com.sims.configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author maneesh
 *
 */
public class ConnectionProvider {
    
    public static Connection getConnection() {
        
        String mysqlUrl = Config.getMySqlUrl();
        String dbName = Config.getDbName();
        String dbUserName = Config.getDbUserName();
        String dbPassword = Config.getDbPassword();
        String driverName = Config.getDriverName();
        
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(mysqlUrl + "/" +dbName, dbUserName, dbPassword);
            return con;
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void close(Connection con) throws SQLException {
    	if (con != null) {
        	con.close();
		}
    }
    
}
