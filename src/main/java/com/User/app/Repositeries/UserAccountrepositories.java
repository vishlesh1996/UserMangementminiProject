package com.User.app.Repositeries;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.User.app.Entities.UserAccounts;


@Repository
public interface UserAccountrepositories extends JpaRepository<UserAccounts, Serializable> {
	
public	UserAccounts findByEmailAndPassword(String email,String password);
	
public UserAccounts findByEmail(String email);
	
}
