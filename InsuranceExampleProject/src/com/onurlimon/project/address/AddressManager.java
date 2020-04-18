package com.onurlimon.project.address;

import java.util.ArrayList;
import java.util.List;

import com.onurlimon.project.user.User;

public class AddressManager {

	public void addUserAddress(User user, Address address) {
		if (user.getUserAddressList().size() == 0) {

			List<Address> addressList = new ArrayList<>();

			addressList.add(address);

			user.setUserAddressList(addressList);

			System.out.println("Successfully added");
		} else {

			user.getUserAddressList().add(address);
		}
	}

	public void removeUserAddress(User user, Address address) {
		if (user.getUserAddressList().size() > 0) {

			user.getUserAddressList().remove(address);
		}
	}
}