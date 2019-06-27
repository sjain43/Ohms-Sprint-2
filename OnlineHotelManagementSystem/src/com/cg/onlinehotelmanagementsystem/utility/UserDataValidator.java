package com.cg.onlinehotelmanagementsystem.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.onlinehotelmanagementsystem.exception.UserEmailException;
import com.cg.onlinehotelmanagementsystem.exception.UserIdException;
import com.cg.onlinehotelmanagementsystem.exception.UserNameException;
import com.cg.onlinehotelmanagementsystem.exception.UserPasswordException;
import com.cg.onlinehotelmanagementsystem.exception.UserPhoneException;
/**
 * User entered data validator class
 * @author trainee
 *
 */
public class UserDataValidator {
	public boolean isValidUserId(String userid) throws UserIdException {
		// checking the appropriate user-id input

		Pattern usridPtrn = Pattern.compile("^[a-zA-Z]{1}[a-zA-Z0-9]{3,5}$");
		Matcher matchid = usridPtrn.matcher(userid);
		if (matchid.matches()) {
			return true;
		} else {
			throw new UserIdException("Please enter userid in correct format");
		}
	}

	public boolean isValidUserFirstName(String firstusername) throws UserNameException {
		// checking the appropriate user-firstname input

		Pattern usrnamefirstptrn = Pattern.compile("^[a-zA-Z]{2,16}");
		Matcher matchnamefirst = usrnamefirstptrn.matcher(firstusername);
		if (matchnamefirst.matches()) {
			return true;
		} else {
			throw new UserNameException("Please insert first name in correct format");

		}
	}

	public boolean isValidUserSurName(String usersirname) throws UserNameException {
		// checking the appropriate user-surname input

		Pattern usrsirnameptrn = Pattern.compile("^[a-zA-Z]{2,6}");
		Matcher matchsirname = usrsirnameptrn.matcher(usersirname);
		if (matchsirname.matches()) {
			return true;
		} else {
			throw new UserNameException("Please insert sir name in correct format");

		}
	}

	public boolean isValidEmail(String email) throws UserEmailException {
		// checking the appropriate user-email input
		Pattern usremailptr = Pattern.compile("^(.+)@(.+)$");
		Matcher emailmtc = usremailptr.matcher(email);
		if (emailmtc.matches()) {
			return true;
		} else {
			throw new UserEmailException("Please insert email in correct format");

		}
	}

	public boolean isValidPhone(String phone) throws UserPhoneException {
		// checking the appropriate user-phone-no input

		Pattern phonenocheck = Pattern.compile("^[6-9]{1}[0-9]{9}$");
		Matcher mtchphoneno = phonenocheck.matcher(phone);
		if (mtchphoneno.matches()) {
			return true;
		} else {
			throw new UserPhoneException("Please insert phoneno. in correct format");

		}
	}
	public boolean isValidPassword(String password) throws UserPasswordException {
		// checking the appropriate user-phone-no input

		Pattern passwordcheck = Pattern.compile("^[a-zA-Z0-9]{4,8}$");
		Matcher mtchpassword = passwordcheck.matcher(password);
		if (mtchpassword.matches()) {
			return true;
		} else {
			throw new UserPasswordException("Please insert password in correct format");

		}
	}

}
