package com.User.app.Entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "USER_ACCOUNTS")
public class UserAccounts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID" )
	private Integer userId;
	@Column(name = "USER_FIRSTNAME" )
	private String fname;
	@Column(name = "USER_LASTNAME" )
	private String lname;
	@Column(name ="USER_EMAILID", unique = true)
	private String email;
	@Column(name = "USER_PASSWORD")
	private String password;
	@Column(name ="USER_DOB")
	private String dob;
	@Column(name ="USER_NUMBER" )
	private long num;
	@Column(name ="USER_GENDAR" )
	private String gendar;
	@Column(name ="USER_CITYNAME" )
	private String cityName;
	@Column(name ="USER_STATENAME" )
	private String stateName;
	@Column(name ="USER_COUNTRYNAME" )
	private String countryName;
	@Column(name = "ACCOUNTSTATUS")
	private String accStatus;
	@Column(name ="CREATE_DATE",updatable = false)
	@CreationTimestamp
	private LocalDate createdate;
	@Column(name ="UPDATE_DATE",insertable = false)
	@UpdateTimestamp
	private LocalDate updatedate;

	
	
	

}
