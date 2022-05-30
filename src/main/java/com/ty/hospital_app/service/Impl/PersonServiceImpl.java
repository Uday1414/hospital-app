package com.ty.hospital_app.service.Impl;

import java.util.List;

import com.ty.hospital_app.dao.impl.PersonDaoImpl;
import com.ty.hospital_app.dto.Person;
import com.ty.hospital_app.service.PersonService;

public class PersonServiceImpl implements PersonService {
	PersonDaoImpl personDaoImpl =new PersonDaoImpl();
	@Override
	public Person savePerson(Person person) {
		return personDaoImpl.savePerson(person);
	}

	@Override
	public Person getPersonById(int person_id) {
		return personDaoImpl.getPersonById(person_id);
	}

	@Override
	public Person updatePersonById(int person_id, Person person) {
		return personDaoImpl.updatePersonById(person_id, person);
	}

	@Override
	public boolean deletePersonById(int person_id) {
		return personDaoImpl.deletePersonById(person_id);
	}

	@Override
	public List<Person> getAllPersons() {
		return personDaoImpl.getAllPersons();
	}

}
