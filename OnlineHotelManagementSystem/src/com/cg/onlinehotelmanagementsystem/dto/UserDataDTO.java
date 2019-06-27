package com.cg.onlinehotelmanagementsystem.dto;
/**
 * User data dto class
 * @author trainee
 *
 */
public class UserDataDTO {
	//All the attributes for getting user-data input
	private String userid;
	private String firstname;
	private String lastname;
	private String password;
	private String email;
	private String phone;

	public UserDataDTO(String userid, String firstname, String lastname, String password, String email, String phone) {
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.email = email;
		this.phone = phone;

	}

	public String getUserid() {
		return userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

}
