package com.cg.onlinehotelmanagementsystem.staticdb;

import java.util.ArrayList;

import com.cg.onlinehotelmanagementsystem.dto.UserAddressDTO;
import com.cg.onlinehotelmanagementsystem.dto.UserDataDTO;

/**
 * User database class
 * 
 * @author trainee
 *
 */
public class UserDatabase {
	// All the client data are stored here.
	public ArrayList<UserDataDTO> userlist = new ArrayList<UserDataDTO>();
	public ArrayList<UserAddressDTO> useraddress = new ArrayList<UserAddressDTO>();
	public ArrayList<String> states = new ArrayList<String>();
	public ArrayList<String> rajcities = new ArrayList<String>();
	public ArrayList<String> mahcities = new ArrayList<String>();
	public ArrayList<String> gujcities = new ArrayList<String>();
	public ArrayList<String> tamcities = new ArrayList<String>();

	public void setAUser() {
		UserDataDTO user = new UserDataDTO("shub12", "shubham", "jain", "shobi09", "shubh@gmail.com", "8104911275");
		userlist.add(user);

	}

	public void setState() {
		states.add("1.Rajasthan");
		states.add("2.Tamilnadu");
		states.add("3.Maharasthra");
		states.add("4.Gujarat");
	}

	public void setRajCity() {
		rajcities.add("1.Jaipur");
		rajcities.add("2.Ajmer");
		rajcities.add("3.Jodhpur");
		rajcities.add("4.Kota");
	}

	public void setMahCity() {
		mahcities.add("1.Mumbai");
		mahcities.add("2.Pune");
		mahcities.add("3.Nasik");
		mahcities.add("4.Nagpur");
	}

	public void setGujCity() {
		gujcities.add("1.Gandhinagar");
		gujcities.add("2.Ahmdabad");
		gujcities.add("3.Surat");
		gujcities.add("4.Rajkot");
	}

	public void setTamCity() {
		tamcities.add("1.Salem");
		tamcities.add("2.Chennai");
		tamcities.add("3.Madurai");
		tamcities.add("4.Vellore");
	}

}
