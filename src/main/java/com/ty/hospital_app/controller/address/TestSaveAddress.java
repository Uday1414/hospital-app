package com.ty.hospital_app.controller.address;

import com.ty.hospital_app.dao.impl.AddressDaoImpl;
import com.ty.hospital_app.dto.Address;

public class TestSaveAddress {
	public static void main(String[] args) {
		Address address = new Address();
		address.setStreet("Market");
		address.setState("Karnataka");
		address.setCountry("India");
		address.setPincode(522113);
		
		AddressDaoImpl addressDaoImpl = new AddressDaoImpl();
		Address address2=addressDaoImpl.saveAddress(2, address);
		if(address2!=null) {
			System.out.println("Saved");
		}else {
			System.out.println("Not Saved");
		}
	}
}
