package com.ty.hospital_app.controller.person;

import com.ty.hospital_app.dto.Person;
import com.ty.hospital_app.service.Impl.PersonServiceImpl;

public class TestUpdatePersonById {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setPerson_name("uday");
		person1.setPerson_email("uday@mail.com");
		person1.setPerson_phone(8328640567l);
		PersonServiceImpl personServiceImpl = new PersonServiceImpl();
		Person person = personServiceImpl.updatePersonById(1, person1);
		if(person!=null) {
			System.out.println("Updated");
		}else {
			System.out.println("No person with given id");
		}
	}
}
