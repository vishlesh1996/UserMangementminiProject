package com.User.app.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.User.app.binding.Userloginbinding;
import com.User.app.service.ServiceI;



@RestController
public class LoginController {

	@Autowired
	private ServiceI serviceI;

	@PostMapping("/login")
	public String login(@RequestBody Userloginbinding userloginbinding) {

		String login = serviceI.login(userloginbinding);

		return login;
	}

}
