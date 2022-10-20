/**
 * 
 */
package com.sims.utils;

import java.util.List;

import com.sims.models.User;

/**
 * This is the Validations class
 * 
 * @author maneesh
 */
public class Validations {
	
	public static boolean isValidEmail(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
	}
	
	public static boolean isUserHasNulls(List<User> userDetails) {
	    if (userDetails != null) {
	        for(Object a : userDetails)
	            if(a != null) return false;
	    }
	    return true;
	}

}
