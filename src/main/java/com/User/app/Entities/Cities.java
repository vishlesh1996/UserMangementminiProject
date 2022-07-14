package com.User.app.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "CITIES_MASTER")
public class Cities {

	@Id
	@Column(name ="USER_CITYID" )
	private Integer cityId;
	@Column(name ="USER_CITYNAME" )
	private String cityName;
	@Column(name ="USER_STATEID" )
	private Integer stateId;
	
}
