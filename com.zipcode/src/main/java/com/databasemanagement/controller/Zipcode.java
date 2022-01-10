package com.databasemanagement.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Zipcode {
	@Id
	
	private int zcode;
	private String state,city,country;
	public int getZcode() {
		return zcode;
	}
	public void setZcode(int zcode) {
		this.zcode = zcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Zipcode [zcode=" + zcode + ", state=" + state + ", city=" + city + ", country=" + country + "]";
	}
	

}
