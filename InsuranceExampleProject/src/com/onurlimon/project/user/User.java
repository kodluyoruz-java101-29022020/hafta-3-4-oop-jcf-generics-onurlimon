package com.onurlimon.project.user;

import java.util.Date;
import java.util.List;

import com.onurlimon.project.address.Address;

public class User {

	private String name;
	private String surName;
	private String email;
	private String password;
	private String job;
	private Integer age;
	private List<Address> userAddressList;
	private Date lastLoginDate;

	public User() {

	}

	public User(String name, String surName, String email, String password, String job, Integer age,
			List<Address> userAddressList, Date lastLoginDate) {
		super();
		this.name = name;
		this.surName = surName;
		this.email = email;
		this.password = password;
		this.job = job;
		this.age = age;
		this.userAddressList = userAddressList;
		this.lastLoginDate = lastLoginDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Address> getUserAddressList() {
		return userAddressList;
	}

	public void setUserAddressList(List<Address> userAddressList) {
		this.userAddressList = userAddressList;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surName=" + surName + ", email=" + email + ", password=" + password + ", job="
				+ job + ", age=" + age + ", userAddressList=" + userAddressList + ", lastLoginDate=" + lastLoginDate
				+ "]";
	}
	
	
	

}
