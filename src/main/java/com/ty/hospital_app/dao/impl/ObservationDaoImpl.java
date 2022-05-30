package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital_app.dao.ObservationDao;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Observation;

public class ObservationDaoImpl implements ObservationDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public Observation saveObservation(Observation observation, int encouonter_id) {
		Encounter encounter = entityManager.find(Encounter.class, encouonter_id);
		observation.setEncounter(encounter);
		entityTransaction.begin();
		entityManager.persist(observation);
		entityTransaction.commit();
		return entityManager.find(Observation.class, observation.getObservation_id());
	}

	@Override
	public List<Observation> getAllObservation(int encounter_id) {
		Encounter encounter = entityManager.find(Encounter.class, encounter_id);
		return encounter.getObservations();
	}

	@Override
	public boolean deleteObservation(int observation_id) {
		Observation observation = entityManager.find(Observation.class, observation_id);
		if (observation != null) {
			entityTransaction.begin();
			entityManager.remove(observation);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
