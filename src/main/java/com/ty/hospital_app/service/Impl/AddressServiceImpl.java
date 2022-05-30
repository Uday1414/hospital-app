package com.ty.hospital_app.service.Impl;

import com.ty.hospital_app.dao.impl.AddressDaoImpl;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.service.AddressService;

public class AddressServiceImpl implements AddressService {
	
	AddressDaoImpl addressDaoImpl = new AddressDaoImpl();
	public Address saveAddress(int branch_id, Address address) {
		return addressDaoImpl.saveAddress(branch_id, address);
	}

	public boolean deleteAddressById(int address_id) {
		return addressDaoImpl.deleteAddressById(address_id);
	}

	public Address getAddressById(int address_id) {
		return addressDaoImpl.getAddressById(address_id);
	}

	public Address updateAddressById(int address_id, Address address) {
		return addressDaoImpl.updateAddressById(address_id, address);
	}
	

	
}
