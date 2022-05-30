package com.ty.hospital_app.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital_app.dao.AddressDao;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;

public class AddressDaoImpl implements AddressDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Address saveAddress(int branch_id, Address address) {
		Branch branch = entityManager.find(Branch.class, branch_id);
		address.setBranch(branch);
		entityTransaction.begin();
		entityManager.persist(address);
		entityTransaction.commit();
		return entityManager.find(Address.class, address.getAddress_id());
	}

	public boolean deleteAddressById(int address_id) {
		Address address = entityManager.find(Address.class, address_id);
		if (address != null) {
			entityTransaction.begin();
			entityManager.remove(address);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public Address getAddressById(int address_id) {
		return entityManager.find(Address.class, address_id);
	}

	public Address updateAddressById(int address_id, Address address) {
		Address address1 = entityManager.find(Address.class, address_id);
		if(address1!=null) {
			address.setAddress_id(address_id);
			entityTransaction.begin();
			entityManager.merge(address);
			entityTransaction.commit();
			return entityManager.find(Address.class,address.getAddress_id());
		}
		return null;
	}

}
