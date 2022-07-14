package com.User.app.service;

import java.util.Map;

import com.User.app.binding.UserManagmentAppBinding;
import com.User.app.binding.Userloginbinding;




public interface ServiceI {
	
	public String login (Userloginbinding userloginbinding);
	
	 public Map<Integer, String> getCountrys();
	 public Map<Integer, String> getStates(Integer countryId);
     public Map<Integer, String> getCity(Integer stateId);
     public boolean uniqEmil(String email);
     public boolean saveUser(UserManagmentAppBinding userManagmentAppBinding);
}
