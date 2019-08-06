package com.delloite.cms.models;

public class Address {

	private int aId;
	private String city;
	private String state;
	
	
	@Override
	public String toString() {
		return "Address [aId=" + aId + ", city=" + city + ", State=" + state + "]";
	}


	public int getaId() {
		return aId;
	}


	public void setaId(int aId) {
		this.aId = aId;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		state = state;
	}


	public Address(int aId, String city, String state) {
		super();
		this.aId = aId;
		this.city = city;
		state = state;
	}


	public Address() {
		// TODO Auto-generated constructor stub
	}

}
