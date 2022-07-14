package com.User.app.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;


@Entity

@Table(name = "STATES_MASTER")
public class States {
	@Id
	@Column(name ="USER_STATEID" )
	private Integer stateId;
	@Column(name ="USER_STATENAME" )
	private String stateName;
	@Column(name ="USER_COUNTRYID" )
	private Integer countryId;
	public Integer getStateId() {
		return stateId;
	}
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public States(Integer stateId, String stateName, Integer countryId) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.countryId = countryId;
	}
	public States() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "States [stateId=" + stateId + ", stateName=" + stateName + ", countryId=" + countryId + "]";
	}
	
}
