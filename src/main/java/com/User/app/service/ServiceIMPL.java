package com.User.app.service;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.app.Entities.Cities;
import com.User.app.Entities.Country;
import com.User.app.Entities.States;
import com.User.app.Entities.UserAccounts;
import com.User.app.Repositeries.CitiesRepositories;
import com.User.app.Repositeries.Conutryrepositories;
import com.User.app.Repositeries.StatesRepositories;
import com.User.app.Repositeries.UserAccountrepositories;
import com.User.app.binding.UserManagmentAppBinding;
import com.User.app.binding.Userloginbinding;

import net.bytebuddy.utility.RandomString;

@Service
public class ServiceIMPL implements ServiceI {

	@Autowired
	private CitiesRepositories citiesRepositories;
	@Autowired
	private StatesRepositories statesRepositories;
	@Autowired
	private Conutryrepositories conutryrepositories;
	@Autowired
	private UserAccountrepositories userAccountrepositories;

	@Override
	public String login(Userloginbinding userloginbinding) {

		UserAccounts findByEmailAndPassword = userAccountrepositories
				.findByEmailAndPassword(userloginbinding.getEmail(), userloginbinding.getPassword());
		if (findByEmailAndPassword != null) {
			String accStatus = findByEmailAndPassword.getAccStatus();
			if (accStatus.equals("LOCK")) {

				return "ACCOUNT IS LOCK";
			}

			else {
				return "ACCOUNT LOGIN SUCCESSFULL";
			}

		} else {

			return "LOGIN FAIL";
		}

	}
	// --------------------------------------------------------------------------------//

	@Override
	public Map<Integer, String> getCountrys() {

		List<Country> findAll = conutryrepositories.findAll();
		Map<Integer, String> countrymap = new HashMap<>();
		for (Country country : findAll) {
			countrymap.put(country.getCountryId(), country.getContryName());
		}
		return countrymap;
	}

	@Override
	public Map<Integer, String> getStates(Integer countryId) {
		List<States> findByCountryId = statesRepositories.findByCountryId(countryId);
		Map<Integer, String> statesmap = new HashMap<>();
		for (States status : findByCountryId) {
			statesmap.put(status.getStateId(), status.getStateName());
		}

		return statesmap;
	}

	@Override
	public Map<Integer, String> getCity(Integer stateId) {
		List<Cities> findByStatesId = citiesRepositories.findByStateId(stateId);
		Map<Integer, String> citymap = new HashMap<>();
		for (Cities citis : findByStatesId) {
			citymap.put(citis.getCityId(), citis.getCityName());
		}

		return citymap;
	}
	// --------------------------------------------------------------------------------//

	@Override
	public boolean uniqEmil(String email) {
		UserAccounts findByEmail = userAccountrepositories.findByEmail(email);
		if (findByEmail == null) {
			return false;
		} else {
			return true;
		}
	}
	// --------------------------------------------------------------------------------//

	@Override
	public boolean saveUser(UserManagmentAppBinding userManagmentAppBinding) {
		userManagmentAppBinding.setAccStatus("LOCK");
		userManagmentAppBinding.setPassword(genpassword());

		UserAccounts accounts = new UserAccounts();
		BeanUtils.copyProperties(userManagmentAppBinding, accounts);

		UserAccounts save = userAccountrepositories.save(accounts);

		if (save != null) {
			return true;
		} else {

			return false;
		}
	}
	private String genpassword() 
	{
		String randomAlphanumeric = RandomStringUtils.randomAlphanumeric(6);
		return randomAlphanumeric;
		
	}

}
