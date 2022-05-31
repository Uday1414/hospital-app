package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.EncounterDao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Person;

public class EncounterDaoImpl implements EncounterDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public Encounter saveEncounter(int branch_id, int person_id, Encounter encounter) {
		Branch branch = entityManager.find(Branch.class, branch_id);
		Person person = entityManager.find(Person.class, person_id);
		encounter.setBranch(branch);
		encounter.setPerson(person);
		entityTransaction.begin();
		entityManager.persist(encounter);
		entityTransaction.commit();
		return entityManager.find(Encounter.class, encounter.getEncounter_id());
	}

	@Override
	public List<Encounter> getAllEncounterByPersonId(int person_id) {
		Query query = entityManager.createQuery("SELECT e FROM Encounter e WHERE e.person.person_id=?1");
		query.setParameter(1, person_id);
		return query.getResultList();
	}

	@Override
	public Encounter getEncounterById(int encounter_id) {
		return entityManager.find(Encounter.class, encounter_id);
	}

	@Override
	public boolean deleteEncounterById(int encounter_id) {
		Encounter encounter = entityManager.find(Encounter.class, encounter_id);
		if (encounter != null) {
			entityTransaction.begin();
			entityManager.remove(encounter);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Encounter updateEncounterById(int encounter_id, Encounter encounter) {
		Encounter encounter1 = entityManager.find(Encounter.class, encounter_id);
		if(encounter1!=null) {
			encounter.setEncounter_id(encounter1.getEncounter_id());
			encounter.setBranch(encounter1.getBranch());
			encounter.setPerson(encounter1.getPerson());
			entityTransaction.begin();
			entityManager.merge(encounter);
			entityTransaction.commit();
			return entityManager.find(Encounter.class, encounter.getEncounter_id());
		}
		return null;
	}

}
