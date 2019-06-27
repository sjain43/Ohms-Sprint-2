package com.cg.onlinehotelmanagementsystem.utility;

import com.cg.onlinehotelmanagementsystem.exception.DuplicateUserException;
import com.cg.onlinehotelmanagementsystem.staticdb.UserDatabase;

/**
 * Registered user check class
 * 
 * @author trainee
 *
 */
public class DuplicateRegisterCheck {
	UserDatabase userdatabase = new UserDatabase();

	public boolean userIdValidation(String userid, String email, String phone) throws DuplicateUserException {
		// checking for duplicate user who already registered
		userdatabase.setAUser();
		int dbsize = userdatabase.userlist.size();
		for (int userinfo = 0; userinfo <= dbsize; userinfo++) {
			if (userid.equalsIgnoreCase(userdatabase.userlist.get(userinfo).getUserid())) {

				throw new DuplicateUserException("User is already registered Please try with another id");
			}
			userEmailValidation(email);
			userPhoneValidation(phone);
			return true;

		}
		return false;

	}

	public boolean userEmailValidation(String email) throws DuplicateUserException {
		userdatabase.setAUser();
		int dbsize = userdatabase.userlist.size();
		for (int userinfo = 0; userinfo <= dbsize; userinfo++) {
			if (email.equalsIgnoreCase(userdatabase.userlist.get(userinfo).getEmail())) {

				throw new DuplicateUserException("User is already registered please try with another email");
			}
			return true;

		}
		return false;

	}

	public boolean userPhoneValidation(String phone) throws DuplicateUserException {
		userdatabase.setAUser();
		int dbsize = userdatabase.userlist.size();
		for (int userinfo = 0; userinfo <= dbsize; userinfo++) {
			if (phone.equalsIgnoreCase(userdatabase.userlist.get(userinfo).getPhone())) {

				throw new DuplicateUserException("User is already registered please try with another phoneno");
			}
			return true;

		}
		return false;

	}
}