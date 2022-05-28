package com.ty.hospital_app.dao;

import com.ty.hospital_app.dto.Address;

public interface AddressDao {
	Address saveAddress(int branch_id, Address address);

	boolean deleteAddressById(int address_id);

	Address getAddressById(int address_id);

	Address updateAddressById(int address_id, Address address);

}
