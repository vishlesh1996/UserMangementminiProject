package com.User.app.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "COUNTRY_MASTER")
public class Country {
	@Id
	@Column(name ="USER_COUNTRYID" )
	private Integer countryId;
	@Column(name ="USER_COUNTRYNAME" )
	private String contryName;
	@Column(name ="USER_COUNTRYCODE")
	private Integer contryCode;
	
}
