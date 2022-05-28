package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Person;

public interface PersonDao {
	Person savePerson(Person person);

	Person getPersonById(int person_id);

	Person updatePersonById(int person_id, Person person);

	boolean deletePersonById(int person_id);

	List<Person> getAllPersons();
}
