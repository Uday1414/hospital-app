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
		Branch branch=entityManager.find(Branch.class, branch_id);
		address.setBranch(branch);
		entityTransaction.begin();
		entityManager.persist(address);
		entityTransaction.commit();
		return entityManager.find(Address.class,address.getAddress_id());
	}

	public boolean deleteAddressById(int address_id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Address getAddressById(int address_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Address updateAddressById(int address_id, Address address) {
		// TODO Auto-generated method stub
		return null;
	}

}
