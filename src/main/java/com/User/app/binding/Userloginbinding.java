package com.User.app.binding;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Userloginbinding {
	
	private String email;
	
	private String password;

}
