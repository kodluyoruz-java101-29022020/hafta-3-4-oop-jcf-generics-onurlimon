package com.onurlimon.project.insurance;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TravelInsurance extends Insurance{
	
	public TravelInsurance() {
		
	}

	public TravelInsurance(String insuranceName, double insurancePrice, Date insuranceStartDate,
			Date insuranceFinishDate) {
		super(insuranceName, insurancePrice, insuranceStartDate, insuranceFinishDate);
	}

	@Override
	public double calculate() {
		
		long difference = super.getInsuranceStartDate().getTime() - super.getInsuranceFinishDate().getTime();

		long diffCalculate = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);

		double calculatePrice = (super.getInsurancePrice() * diffCalculate) * 0.10;

		return super.getInsurancePrice() + calculatePrice;
	}
	
	

}
