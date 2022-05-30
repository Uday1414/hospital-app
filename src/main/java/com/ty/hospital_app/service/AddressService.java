package com.ty.hospital_app.service;

import com.ty.hospital_app.dto.Address;

public interface AddressService {
	Address saveAddress(int branch_id, Address address);

	boolean deleteAddressById(int address_id);

	Address getAddressById(int address_id);

	Address updateAddressById(int address_id, Address address);

}
