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
public class ConnectionProvider extends Config {
    
    public static Connection getConnection() {
        
        String mysqlUrl = getMySqlUrl();
        String dbName = getDbName();
        String dbUserName = getDbUserName();
        String dbPassword = getDbPassword();
        String driverName = getDriverName();
        
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(mysqlUrl + "/" +dbName, dbUserName, dbPassword);
            return con;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("SQLException -" + e.getMessage());
            return null;
        }
    }
    
}
