package com.ty.hospital_app.controller.person;

import com.ty.hospital_app.dto.Person;
import com.ty.hospital_app.service.Impl.PersonServiceImpl;

public class TestSavePerson {
	public static void main(String[] args) {
		Person person = new Person();
		person.setPerson_name("naresh");
		person.setPerson_email("naresh@mail.com");
		person.setPerson_phone(9985855663l);
		PersonServiceImpl personServiceImpl = new PersonServiceImpl();
		Person person2 = personServiceImpl.savePerson(person);
		if(person2!=null) {
			System.out.println("saved");
		}else {
			System.out.println("Not saved");
		}
	}
}
