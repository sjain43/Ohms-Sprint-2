package com.cg.onlinehotelmanagementsystem.service;

import com.cg.onlinehotelmanagementsystem.dto.UserAddressDTO;
import com.cg.onlinehotelmanagementsystem.dto.UserDataDTO;
import com.cg.onlinehotelmanagementsystem.exception.DuplicateUserException;
/**
 * Interface declaration
 * @author trainee
 *
 */
public interface IRegistration {
	boolean userRegistration(UserDataDTO user, UserAddressDTO useradd);
	boolean userValidation(String userid, String email, String phone) throws DuplicateUserException;
}
