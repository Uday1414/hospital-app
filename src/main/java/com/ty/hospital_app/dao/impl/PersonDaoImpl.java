package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.PersonDao;
import com.ty.hospital_app.dto.Person;

public class PersonDaoImpl implements PersonDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public Person savePerson(Person person) {

		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		return entityManager.find(Person.class, person.getPerson_id());
	}

	@Override
	public Person getPersonById(int person_id) {

		return entityManager.find(Person.class, person_id);
	}

	@Override
	public Person updatePersonById(int person_id, Person person) {
		Person person2 = entityManager.find(Person.class,person_id);
		if(person2!=null) {
			person.setPerson_id(person2.getPerson_id());
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
			return entityManager.find(Person.class,person.getPerson_id());
		}
		return null;
	}

	@Override
	public boolean deletePersonById(int person_id) {
		Person person = entityManager.find(Person.class, person_id);
		if (person != null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Person> getAllPersons() {
		Query query = entityManager.createQuery("SELECT p FROM Person p");
		return query.getResultList();
	}

}
