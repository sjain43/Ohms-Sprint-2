package com.cg.onlinehotelmanagementsystem.service.impl;

import com.cg.onlinehotelmanagementsystem.dto.UserAddressDTO;
import com.cg.onlinehotelmanagementsystem.dto.UserDataDTO;
import com.cg.onlinehotelmanagementsystem.exception.DuplicateUserException;
import com.cg.onlinehotelmanagementsystem.service.IRegistration;
import com.cg.onlinehotelmanagementsystem.staticdb.UserDatabase;
import com.cg.onlinehotelmanagementsystem.utility.DuplicateRegisterCheck;
/**
 * User registration class
 * @author trainee
 *
 */
public class RegistrationImpl implements IRegistration {
	@Override
	public boolean userRegistration(UserDataDTO user, UserAddressDTO useradd) {
		// method for doing customer registration
		UserDatabase userdata = new UserDatabase();
		userdata.userlist.add(user);
		userdata.useraddress.add(useradd);
		return true;

	}

	@Override
	public boolean userValidation(String userid, String email, String phone) throws DuplicateUserException {
		// Method for checking customer validation
		DuplicateRegisterCheck regcheck = new DuplicateRegisterCheck();
		return regcheck.userIdValidation(userid, email, phone);
	}
}
