package com.User.app.binding;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserManagmentAppBinding {
	
	private String fname;
	private String lname;
	private String email;
	private String password;
	private String dob;
	private long num;
	private String gendar;
	private String cityName;
	private String countryName;
	private String stateName;
	private String accStatus;

}
