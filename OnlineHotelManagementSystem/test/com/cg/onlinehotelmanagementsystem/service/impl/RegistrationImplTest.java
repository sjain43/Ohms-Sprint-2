package com.cg.onlinehotelmanagementsystem.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

import com.cg.onlinehotelmanagementsystem.dto.UserAddressDTO;
import com.cg.onlinehotelmanagementsystem.dto.UserDataDTO;
import com.cg.onlinehotelmanagementsystem.exception.DuplicateUserException;
import com.cg.onlinehotelmanagementsystem.exception.UserCityException;
import com.cg.onlinehotelmanagementsystem.exception.UserEmailException;
import com.cg.onlinehotelmanagementsystem.exception.UserHomeNoException;
import com.cg.onlinehotelmanagementsystem.exception.UserIdException;
import com.cg.onlinehotelmanagementsystem.exception.UserNameException;
import com.cg.onlinehotelmanagementsystem.exception.UserPhoneException;
import com.cg.onlinehotelmanagementsystem.exception.UserPincodeException;
import com.cg.onlinehotelmanagementsystem.service.IRegistration;
import com.cg.onlinehotelmanagementsystem.utility.UserAddressValidator;
import com.cg.onlinehotelmanagementsystem.utility.UserDataValidator;

public class RegistrationImplTest {
	UserAddressValidator userAdd = new UserAddressValidator();
	UserDataValidator userData = new UserDataValidator();
	IRegistration register = new RegistrationImpl();

	@Test
	public void testValidUserReg() throws Exception {
		boolean userregistered = register.userRegistration(
				new UserDataDTO("shub14", "shubham", "jain", "shobi09", "shubhamjain@gmail.com", "9595959595"),
				new UserAddressDTO("shub14", "Rajasthan", "jaipur", 302033, "15b"));
		       assertTrue(userregistered);
	}
	
	@Test
	public void testUserValidationFailed() throws DuplicateUserException {
		boolean duplicate = register.userValidation("Shub12546", "shub@gmail.com", "8104911278");
		assertTrue(duplicate);
	}

	@Test
	public void testUserId() throws UserIdException {
		boolean id = userData.isValidUserId("shub15");
		assertTrue(id);
	}

	@Test(expected = UserIdException.class)
	public void testUserIdNotValid() throws UserIdException {
		boolean id = userData.isValidUserId("shub155");
	}

	@Test
	public void testValidUserFirstName() throws UserNameException {
		boolean name = userData.isValidUserFirstName("shubham");
		assertTrue(name);
	}

	@Test(expected = UserNameException.class)
	public void testValidUserFirstNameFailed() throws UserNameException {
		boolean name = userData.isValidUserFirstName("shubha12");
	}

	@Test
	public void testValidUserSurName() throws UserNameException {
		boolean sirname = userData.isValidUserSurName("jain");
		assertTrue(sirname);
	}

	@Test
	public void testValidEmail() throws UserEmailException {
		boolean email = userData.isValidEmail("shubham@gmail.com");
		assertTrue(email);
	}

	@Test(expected = UserEmailException.class)
	public void testValidEmailFailed() throws UserEmailException {
		boolean email = userData.isValidEmail("shubham@");
	}

	@Test
	public void testisValidPhone() throws UserPhoneException {
		boolean phone = userData.isValidPhone("8104911275");
		assertTrue(phone);
	}

	@Test(expected = UserPhoneException.class)
	public void testValidPhoneFailed() throws UserPhoneException {
		boolean phone = userData.isValidPhone("81049112@s");
	}

	@Test(expected = UserPhoneException.class)
	public void testsValidPhoneFailed() throws UserPhoneException {
		boolean phone = userData.isValidPhone("81049112755");
	}

	@Test
	public void testUserValidCity() throws UserCityException {
		boolean city = userAdd.isValidCity("jaipur");
		assertTrue(city);
	}

	@Test(expected = UserCityException.class)
	public void testUserValidCityFailed() throws UserCityException {
		boolean city = userAdd.isValidCity("jaipur@1");
	}

	@Test
	public void testValidPincode() throws UserPincodeException {
		boolean pincode = userAdd.isValidPincode("322001");
		assertTrue(pincode);
	}

	@Test(expected = UserPincodeException.class)
	public void testValidPincodeFailed() throws UserPincodeException {
		boolean pincode = userAdd.isValidPincode("3220011");
	}

	@Test
	public void testValidHomeno() throws UserHomeNoException {
		boolean homeno = userAdd.isValidHomeno("15b");
		assertTrue(homeno);
	}
}
