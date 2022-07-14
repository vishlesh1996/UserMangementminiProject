package com.User.app.Repositeries;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.User.app.Entities.Country;



public interface Conutryrepositories extends JpaRepository<Country, Serializable> {

}
