package com.cg.onlinehotelmanagementsystem.dto;
/**
 * User address data dto class
 * @author trainee
 *
 */
public class UserAddressDTO {
	//All the attributes for getting user-address input
	private String userid;
	private String state;
	private String city;
	private int pincode;
	private String homeno;

	public UserAddressDTO(String userid, String state, String city, int pincode2, String homeno) {
		this.userid = userid;
		this.state = state;
		this.city = city;
		this.pincode = pincode2;
		this.homeno = homeno;

	}
	public String getUserid() {
		return userid;
	}

	public String getState() {
		return state;
	}

	public String getCity() {
		return city;
	}

	public int getPincode() {
		return pincode;
	}

	public String getHomeno() {
		return homeno;
	}
}
