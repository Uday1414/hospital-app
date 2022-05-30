package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital_app.dao.MedOrderDao;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.MedOrder;

public class MedOrderDaoImpl implements MedOrderDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	@Override
	public MedOrder saveMedOrder(int encounter_id, MedOrder medOrder) {
		Encounter encounter = entityManager.find(Encounter.class,encounter_id);
		medOrder.setEncounter(encounter);
		entityTransaction.begin();
		entityManager.persist(medOrder);
		entityTransaction.commit();
		return entityManager.find(MedOrder.class,medOrder.getMedOrder_id());
	}

	@Override
	public MedOrder getMedOrderById(int medOrder_id) {
		return entityManager.find(MedOrder.class,medOrder_id);
	}

	@Override
	public List<MedOrder> getAllMedOrders(int encounter_id) {
		Encounter encounter = entityManager.find(Encounter.class,encounter_id);
		return encounter.getMedOrders();
	}

	@Override
	public MedOrder updateMedOrderById(int medOrder_id, MedOrder medOrder) {
		MedOrder medOrder1= entityManager.find(MedOrder.class,medOrder_id);
		if(medOrder1!=null) {
			medOrder.setEncounter(medOrder1.getEncounter());
			medOrder.setMedOrder_id(medOrder1.getMedOrder_id());
			entityTransaction.begin();
			entityManager.merge(medOrder);
			entityTransaction.commit();
			return entityManager.find(MedOrder.class,medOrder.getMedOrder_id());
		}
		return null;
	}

	@Override
	public boolean deleteMedOrderById(int medOrder_id) {
		MedOrder medOrder = entityManager.find(MedOrder.class,medOrder_id);
		if(medOrder!=null) {
			entityTransaction.begin();
			entityManager.remove(medOrder);
			entityTransaction.commit();
			return true;
		}else {
			return false;
		}
	}

}
