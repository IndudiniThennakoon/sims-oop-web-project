/**
 * 
 */
package com.sims.configs;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author maneesh
 *
 */
public class Config {
	
	private static final Properties prop = new Properties();
	
    private static String MYSQL_URL = "";
    private static String DB_NAME = "";
    private static String DB_USERNAME = "";
    private static String DB_PASSWORD = "";
    private static String DRIVER_NAME = "";

	static {
		//Static Initialization Block : In the entire program, this will execute only one time.
		try {
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			InputStream input = classLoader.getResourceAsStream("WEB-INF/environments/env.properties");

//        prop.load(new FileInputStream("env.properties"));
	        prop.load(input);

	        MYSQL_URL = prop.getProperty("MYSQL_URL");
	        DB_NAME = prop.getProperty("DB_NAME");
	        DB_USERNAME = prop.getProperty("DB_USERNAME");
	        DB_PASSWORD = prop.getProperty("DB_PASSWORD");
	        DRIVER_NAME = prop.getProperty("DRIVER_NAME");

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
    
    
    public static String getMySqlUrl() {
        return MYSQL_URL;
    }
    
    public static String getDbName() {
        return DB_NAME;
    }
    
    public static String getDbUserName() {
        return DB_USERNAME;
    }
    
    public static String getDbPassword() {
        return DB_PASSWORD;
    }
    
    public static String getDriverName() {
        return DRIVER_NAME;
    }
    
}
