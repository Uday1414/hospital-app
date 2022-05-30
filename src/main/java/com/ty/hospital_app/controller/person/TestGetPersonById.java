package com.ty.hospital_app.controller.person;

import java.util.List;

import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Person;
import com.ty.hospital_app.service.Impl.PersonServiceImpl;

public class TestGetPersonById {
	public static void main(String[] args) {
		PersonServiceImpl personServiceImpl = new PersonServiceImpl();
		Person person = personServiceImpl.getPersonById(1);
		if(person!=null) {
			System.out.println("Name  : "+person.getPerson_name());
			List<Encounter> encounters = person.getEncounters();
			for(Encounter encounter : encounters) {
				System.out.println("Reason : "+encounter.getReason());
			}
		}
	}
}
