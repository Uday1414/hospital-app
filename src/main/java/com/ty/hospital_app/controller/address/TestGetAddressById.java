package com.ty.hospital_app.controller.address;

import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.service.Impl.AddressServiceImpl;

public class TestGetAddressById {
	public static void main(String[] args) {
		AddressServiceImpl addressServiceImpl = new AddressServiceImpl();
		Address address = addressServiceImpl.getAddressById(1);
		if(address!=null) {
			System.out.println("Address Street : "+address.getStreet());
			Branch branch = address.getBranch();
			System.out.println("Branch Name : "+branch.getBranchName());
		}
		else {
			System.out.println("no address with given id");
		}
	}
}
