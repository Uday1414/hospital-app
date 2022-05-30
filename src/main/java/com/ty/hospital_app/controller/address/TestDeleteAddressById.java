package com.ty.hospital_app.controller.address;

import com.ty.hospital_app.service.Impl.AddressServiceImpl;

public class TestDeleteAddressById {
	public static void main(String[] args) {
		AddressServiceImpl addressServiceImpl = new AddressServiceImpl();
		boolean flag = addressServiceImpl.deleteAddressById(3);
		if(flag) {
			System.out.println("deleted");
		}else {
			System.out.println("Address not found");
		}
	}
}
