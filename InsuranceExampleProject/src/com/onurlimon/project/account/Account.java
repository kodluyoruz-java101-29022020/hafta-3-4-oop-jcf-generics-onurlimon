package com.onurlimon.project.account;

import java.util.ArrayList;
import java.util.List;

import com.onurlimon.project.exception.InvalidAuthenticationException;
import com.onurlimon.project.insurance.Insurance;
import com.onurlimon.project.user.User;

public abstract class Account {
	
	private User user;

	private ArrayList<Insurance> insuranceList;

	private AuthenticationStatus status = AuthenticationStatus.SUCCESS;
	
	public Account() {
	}

	public Account(User user, ArrayList<Insurance> insuranceList, AuthenticationStatus status) {
		this.user = user;
		this.insuranceList = insuranceList;
		this.status = status;
	}

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ArrayList<Insurance> getInsuranceList() {
		return insuranceList;
	}

	public void setInsuranceList(ArrayList<Insurance> insuranceList) {
		this.insuranceList = insuranceList;
	}

	public AuthenticationStatus getStatus() {
		return status;
	}

	public void setStatus(AuthenticationStatus status) {
		this.status = status;
	}
	
	public final void showUserInfo() {
        if (this.user != null) {
            StringBuilder builder = new StringBuilder();
            builder.append("Name :");
            builder.append(this.user.getName());
            builder.append("Surname : ");
            builder.append(this.user.getSurName());
            builder.append("Last Time to Login :");
            builder.append(this.user.getLastLoginDate());
            System.out.println(builder.toString());
        } else {
            System.out.println("User not found.");
        }
    }
	
	public void login(String email, String password) throws InvalidAuthenticationException {

		if (email == user.getEmail() && password == user.getPassword()) {

			status.getCode();

		} else {

			throw new InvalidAuthenticationException("Invalid User or Password");
		}

	}
	
	public boolean addInsurance(Account account, Insurance insurance) {

        if (account.getInsuranceList().isEmpty()){

            List<Insurance> insuranceList = new ArrayList<Insurance>();

            insuranceList.add(insurance);
            account.setInsuranceList((ArrayList<Insurance>) insuranceList);

            return true;
        } else {

            account.getInsuranceList().add(insurance);

            return true;
        }

    }

    public void removeInsurance(Account account, Insurance insurace) {

        if (account.getInsuranceList().contains(insurace)) {

            account.getInsuranceList().remove(insurace);
        } else {
            System.out.println("There ise no insurance to delete");
        }

    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((insuranceList == null) ? 0 : insuranceList.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (insuranceList == null) {
			if (other.insuranceList != null)
				return false;
		} else if (!insuranceList.equals(other.insuranceList))
			return false;
		if (status != other.status)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
    
	protected abstract double addProfitMargin(double insurancePrice);
	
}
