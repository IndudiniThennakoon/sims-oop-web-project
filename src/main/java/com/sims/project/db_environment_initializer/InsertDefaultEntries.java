/**
 * 
 */
package com.sims.project.db_environment_initializer;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import com.sims.project.tables.DefaultEntries;

/**
 *
 * @author maneesh
 */
public class InsertDefaultEntries extends DatabaseEnvironment {
	
    /**
     * @throws SQLException 
	 * @see executeEntries(Statement stmt)
     * @addTables - Add new execute table entries
     */
	private static void executeEntries(Statement stmt) throws SQLException {

		// List new execute tables functions here
		DefaultEntries.usersTableEntries(stmt);
        
	}

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Statement stmt = null; 

        try {
        	DatabaseEnvironment.getConnection();
        	
            stmt = CON.createStatement();
            
            executeEntries(stmt);

            JOptionPane.showMessageDialog(null, "Default data insert successfully.!");
            
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
