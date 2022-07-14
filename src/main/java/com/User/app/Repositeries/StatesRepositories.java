package com.User.app.Repositeries;


import java.io.Serializable;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.User.app.Entities.States;


@Repository
public interface StatesRepositories extends JpaRepository<States, Serializable> {

public List<States> findByCountryId(Integer countryId);


}
