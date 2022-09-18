/**
 * 
 */
package com.sims.utils;

/**
 * @author maneesh
 *
 */
public class Enum {

	public static enum UserTypes {
		PRINCIPAL(1),
		TEACHER(2),
		STUDENT(3);
		
		final int type;
		UserTypes(int type) { this.type = type; }
	}

	public static enum UserRolles {
		EXAMPLE1(1),
		EXAMPLE2(2),
		EXAMPLE3(3);
		
		final int type;
		UserRolles(int type) { this.type = type; }
	}
	
}
