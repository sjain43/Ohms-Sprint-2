package com.cg.onlinehotelmanagementsystem.utility;

import com.cg.onlinehotelmanagementsystem.exception.InputMismatchException;
/**
 * User input validator class
 * @author trainee
 *
 */
public class UserInputValidator {
	// checking the appropriate user- input
     public void inputMismatch(String input) throws InputMismatchException {
    	 throw new InputMismatchException("Please enter valid number");
     }
}
