package com.onurlimon.project.account;

import java.util.ArrayList;

import com.onurlimon.project.insurance.Insurance;
import com.onurlimon.project.user.User;

public class IndividualAccount extends Account {

	public IndividualAccount() {
	}

	public IndividualAccount(User user, ArrayList<Insurance> insuranceList, AuthenticationStatus status) {
		super(user, insuranceList, status);
	}

	@Override
	protected double addProfitMargin(double insurancePrice) {
		double totalPrice;
		totalPrice = insurancePrice + (insurancePrice * 0.70);
		return totalPrice;
	}
	
	
	

}
