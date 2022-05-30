package com.ty.hospital_app.controller.person;

import java.util.List;

import com.ty.hospital_app.dto.Person;
import com.ty.hospital_app.service.Impl.PersonServiceImpl;

public class TestGetAllPersons {
	public static void main(String[] args) {
		PersonServiceImpl personServiceImpl = new PersonServiceImpl();
		List<Person> persons = personServiceImpl.getAllPersons();
		if (persons.size() > 0) {
			for (Person person : persons) {
				System.out.println("Person name : " + person.getPerson_name());
			}
		} else {
			System.out.println("No persons ");
		}
	}
}
