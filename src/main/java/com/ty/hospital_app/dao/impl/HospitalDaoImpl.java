package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.HospitalDao;
import com.ty.hospital_app.dto.Hospital;

public class HospitalDaoImpl implements HospitalDao {
	//this class has methods to perform crud operations on Hospital table in database.
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Hospital saveHospital(Hospital hospital) {
		//we pass Hospital Object as parameter and this method saves object as row in hospital table.
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		return entityManager.find(Hospital.class, hospital.getHospital_id());
	}

	public Hospital getHospitalById(int hospital_id) {
		//we pass Hospital_id  as parameter and this method retrieves hospital object from hospital table with given id.
		//return null if hospital object is not present with given id.
		return entityManager.find(Hospital.class, hospital_id);
	}

	public Hospital getHospitalByName(String hospital_name) {
		//we pass Hospital_name  as parameter and this method retrieves hospital object from hospital table with given name.
		//return null if hospital object is not present with given name.
		Query query = entityManager.createQuery("SELECT h FROM Hospital h WHERE h.hospital_name=?1");
		query.setParameter(1, hospital_name);
		List<Hospital> hospitals = query.getResultList();
		return hospitals.get(0);
	}

	public Hospital updateHospitalById(int hospital_id, Hospital hospital) {
		//we pass Hospital_id and Hospital object as parameter and this method updates hospital object from hospital table with given id.
		//return null if hospital object is not present with given id.
		Hospital hospital2 = entityManager.find(Hospital.class, hospital_id);
		if (hospital2 != null) {
			hospital.setHospital_id(hospital_id);
			entityTransaction.begin();
			entityManager.merge(hospital);
			entityTransaction.commit();
			return entityManager.find(Hospital.class, hospital.getHospital_id());
		} else {
			return null;
		}

	}

	public boolean deleteHospitalById(int hospital_id) {
		//we pass Hospital_id  as parameter and this method delete hospital object from hospital table with given id.
		//return false if hospital object is not present with given id or else true.
		Hospital hospital = entityManager.find(Hospital.class, hospital_id);
		if (hospital != null) {
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
