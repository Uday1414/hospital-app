package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dto.Person;

public interface PersonService {
	Person savePerson(Person person);

	Person getPersonById(int person_id);

	Person updatePersonById(int person_id, Person person);

	boolean deletePersonById(int person_id);

	List<Person> getAllPersons();
}
