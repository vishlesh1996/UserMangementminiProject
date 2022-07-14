package com.User.app.Repositeries;


import java.io.Serializable;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.User.app.Entities.Cities;

@Repository
public interface CitiesRepositories extends JpaRepository<Cities,Serializable> {

	public List<Cities> findByStateId(Integer stateId);
	
}
