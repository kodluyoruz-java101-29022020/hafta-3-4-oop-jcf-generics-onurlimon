package com.onurlimon.project.insurance;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CarInsurance extends Insurance {

	public CarInsurance(String insuranceName, double insurancePrice, Date insuranceStartDate,
			Date insuranceFinishDate) {
		super(insuranceName, insurancePrice, insuranceStartDate, insuranceFinishDate);
	}

	@Override
	public double calculate() {

		long difference = super.getInsuranceStartDate().getTime() - super.getInsuranceFinishDate().getTime();

		long differenceCalculate = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);

		double calculatePrice = (super.getInsurancePrice() * differenceCalculate) * 0.20;

		return super.getInsurancePrice() + calculatePrice;
	}

}
