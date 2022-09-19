/**
 * 
 */
package com.sims.project.db_environment_initializer;

import java.awt.HeadlessException;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
*
* Run this file as:  2 Java Application
* 
* @author maneesh
*/
public class CreateDatabase extends DatabaseEnvironment {
    
    public static void main(String args[]) throws SQLException, ClassNotFoundException {
     
    	Statement stmt = null;
    	
        try {
        	DatabaseEnvironment.getConnection("create_db");
            
            System.out.println("Connection established......");
            
            stmt = CON.createStatement();
            
            String query = "CREATE DATABASE " + DB_NAME;
            
            stmt.execute(query);
      
            System.out.println("- '" + DB_NAME + "' Database created.!");
           
            JOptionPane.showMessageDialog(null, "Database created successfully.!");
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            
        } finally {
            try {
            	if (CON != null) {
            		CON.close();
        		}
            	if (CON != null) {
            		stmt.close();
            	}
            
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
   }

}
