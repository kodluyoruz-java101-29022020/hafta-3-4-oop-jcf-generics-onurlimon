package com.onurlimon.project.address;

public class BusinessAddress implements Address {

	private String country;
	private String city;
	private String district;
	private String street;
	private int postCode;
	
	public BusinessAddress() {
		
	}

	public BusinessAddress(String country, String city, String district, String street, int postCode) {
		this.country = country;
		this.city = city;
		this.district = district;
		this.street = street;
		this.postCode = postCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	@Override
	public String toString() {
		return "BusinessAddress [country=" + country + ", city=" + city + ", district=" + district + ", street="
				+ street + ", postCode=" + postCode + "]";
	}

	@Override
	public void getAddressDetail() {
		toString();
		
	}
	
	
}
