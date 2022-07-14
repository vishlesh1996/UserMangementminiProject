package com.User.app.binding;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserConfPasswordbinding {

	private String email;
	
	private String temppass;
	
	private String newpass;
	
	private String confpass;
	
}
