package com.cg.onlinehotelmanagementsystem.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.onlinehotelmanagementsystem.exception.UserCityException;
import com.cg.onlinehotelmanagementsystem.exception.UserHomeNoException;
import com.cg.onlinehotelmanagementsystem.exception.UserPincodeException;
/**
 * User address data validator class
 * @author trainee
 *
 */
public class UserAddressValidator {
	public boolean isValidCity(String city) throws UserCityException {
		// checking the appropriate user-city input
		Pattern citycheck = Pattern.compile("[a-zA-Z]{2,10}");
		Matcher citymtch = citycheck.matcher(city);
		if (citymtch.matches()) {
			return true;
		} else {
			throw new UserCityException("Please insert city name in correct format");

		}
	}

	public boolean isValidPincode(String pincode) throws UserPincodeException {
		// checking the appropriate user-pincode input

		Pattern pincodecheck = Pattern.compile("^[0-9]{6}");
		Matcher mtchpincode = pincodecheck.matcher(pincode);
		if (mtchpincode.matches()) {
			return true;
		} else {
			throw new UserPincodeException("Please insert pincode in correct format");

		}
	}

	public boolean isValidHomeno(String homeno) throws UserHomeNoException {
		// checking the appropriate home-no input

		Pattern homenocheck = Pattern.compile("^[a-zA-Z0-9]{2,4}$");
		Matcher mtchhomeno = homenocheck.matcher(homeno);
		if (mtchhomeno.matches()) {
			return true;
		} else {
			throw new UserHomeNoException("Please insert home-no in correct format");

		}
	}

}
