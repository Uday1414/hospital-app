package com.ty.hospital_app.controller.address;

import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.service.Impl.AddressServiceImpl;

public class TestUpdateAddressbyId {
	public static void main(String[] args) {
		Address address = new Address();
		address.setStreet("Marathahalli");
		address.setState("Karnataka");
		address.setCountry("India");
		address.setPincode(522114);
		AddressServiceImpl addressServiceImpl = new AddressServiceImpl();
		Address address2 = addressServiceImpl.updateAddressById(4, address);
		if(address2!=null) {
			System.out.println("Updated");
		}else {
			System.out.println("no address found");
		}
	}
}
