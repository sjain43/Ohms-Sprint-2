package com.cg.onlinehotelmanagementsystem.main;

import java.util.Scanner;

import com.cg.onlinehotelmanagementsystem.dto.UserAddressDTO;
import com.cg.onlinehotelmanagementsystem.dto.UserDataDTO;
import com.cg.onlinehotelmanagementsystem.exception.DuplicateUserException;
import com.cg.onlinehotelmanagementsystem.exception.InputMismatchException;
import com.cg.onlinehotelmanagementsystem.exception.UserCityException;
import com.cg.onlinehotelmanagementsystem.exception.UserEmailException;
import com.cg.onlinehotelmanagementsystem.exception.UserHomeNoException;
import com.cg.onlinehotelmanagementsystem.exception.UserIdException;
import com.cg.onlinehotelmanagementsystem.exception.UserNameException;
import com.cg.onlinehotelmanagementsystem.exception.UserPasswordException;
import com.cg.onlinehotelmanagementsystem.exception.UserPhoneException;
import com.cg.onlinehotelmanagementsystem.exception.UserPincodeException;
import com.cg.onlinehotelmanagementsystem.service.IRegistration;
import com.cg.onlinehotelmanagementsystem.service.impl.RegistrationImpl;
import com.cg.onlinehotelmanagementsystem.staticdb.UserDatabase;
import com.cg.onlinehotelmanagementsystem.utility.UserAddressValidator;
import com.cg.onlinehotelmanagementsystem.utility.UserDataValidator;
import com.cg.onlinehotelmanagementsystem.utility.UserInputValidator;
/**
 * Register main UI class
 * @author trainee
 *
 */
public class HmsMain {
	public static void main(String[] args) throws Exception {
		// Main function to take all input from user and show the output
		String userInput = "";
		String state = "";
		UserDatabase userdatabase = new UserDatabase();
		IRegistration usersignup = new RegistrationImpl();
		UserInputValidator userinputcheck = new UserInputValidator();

		System.out.println("Welcome to HotelBooking");
		while (true) {
			String email = "";
			String phone = "";
			System.out.println("Press 1 For Registration OR press 2 for exit");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			userInput = scanner.next();
			switch (userInput) {
			case "1": {
				System.out.println("Please enter userid");
				System.out.println(
						"(Userid must be min 4 & max 6 char long start with character can contain char & numbers only)");
				String userId = scanner.next();
				UserDataValidator uservalidation = new UserDataValidator();
				UserAddressValidator useraddress = new UserAddressValidator();
				try {
					uservalidation.isValidUserId(userId);
					usersignup.userValidation(userId, email, phone);
					System.out.println("Please enter Firstname");
					String firstName = scanner.next();
					uservalidation.isValidUserFirstName(firstName);
					System.out.println("Please enter lastname");
					String lastName = scanner.next();
					uservalidation.isValidUserSurName(lastName);
					System.out.println("Please enter Password(can be min 4 and max 8 char long");
					String password = scanner.next();
					uservalidation.isValidPassword(password);
					System.out.println("Please enter email");
					email = scanner.next();
					uservalidation.isValidEmail(email);
					usersignup.userValidation(userId, email, phone);
					System.out.println("Please enter Phone no");
					phone = scanner.next();
					uservalidation.isValidPhone(phone);
					usersignup.userValidation(userId, email, phone);
					UserDataDTO user = new UserDataDTO(userId, firstName, lastName, password, email, phone);
					System.out.println("Please select your state");
					userdatabase.setState();
					for (String string : userdatabase.states) {
						System.out.println(string);
					}
					String stateInput = scanner.next();
					switch (stateInput) {
					case "1":
						state = "Rajasthan";
						break;
					case "2":
						state = "Tamilnadu";
						break;
					case "3":
						state = "Maharastra";
						break;
					case "4":
						state = "Gujarat";
						break;
					default:
						userinputcheck.inputMismatch(stateInput);
					}
					userdatabase.setMahCity();
					userdatabase.setTamCity();
					userdatabase.setRajCity();
					userdatabase.setGujCity();
					switch (stateInput) {
					case "1": {
						for (String rajCities : userdatabase.rajcities) {
							System.out.println(rajCities);
						}
						break;
					}
					case "2": {
						for (String tamCities : userdatabase.tamcities) {
							System.out.println(tamCities);
						}
						break;
					}
					case "3": {
						for (String mahCities : userdatabase.mahcities) {
							System.out.println(mahCities);
						}
						break;
					}
					case "4": {
						for (String gujCities : userdatabase.gujcities) {
							System.out.println(gujCities);
						}
					}
					}
					System.out.println("Please type your city");
					String city = scanner.next();
					useraddress.isValidCity(city);
					System.out.println("Please enter your city pincode");
					int pincode = scanner.nextInt();
					String cityPincode = String.valueOf(pincode);
					useraddress.isValidPincode(cityPincode);
					System.out.println("Please enter your home no");
					String homeNo = scanner.next();
					useraddress.isValidHomeno(homeNo);
					UserAddressDTO useradd = new UserAddressDTO(userId, state, city, pincode, homeNo);
					usersignup.userRegistration(user, useradd);
					System.out.println("Congratulation!! you are logged in to the system");
					System.out.println("press 2 if you want to exit");
					for (int uInput = 1; uInput <= 3; uInput++) {
						String input = scanner.next();
						if (input == "2") {
							System.exit(0);
						} else if (uInput == 3) {
							System.out.println("you have exceed maximum number of tries");
						} else {
							System.out.println("please enter correct detail");
						}
					}
				} catch (UserIdException e) {
					System.out.println(e.getMessage());
				} catch (UserPhoneException e) {
					System.out.println(e.getMessage());
				} catch (UserNameException e) {
					System.out.println(e.getMessage());
				} catch (UserEmailException e) {
					System.out.println(e.getMessage());
				} catch (UserCityException e) {
					System.out.println(e.getMessage());
				} catch (UserPincodeException e) {
					System.out.println(e.getMessage());
				} catch (UserHomeNoException e) {
					System.out.println(e.getMessage());
				} catch (DuplicateUserException e) {
					System.out.println(e.getMessage());
				} catch (InputMismatchException e) {
					System.out.println(e.getMessage());
				} catch (UserPasswordException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case "2": {
				System.exit(0);
				break;
			}
			default:
				System.out.println("please enter correct key");
			}
		}
	}
}