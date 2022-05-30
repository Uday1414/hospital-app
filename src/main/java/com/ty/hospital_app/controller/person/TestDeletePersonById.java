package com.ty.hospital_app.controller.person;

import com.ty.hospital_app.service.Impl.PersonServiceImpl;

public class TestDeletePersonById {
	public static void main(String[] args) {
		PersonServiceImpl personServiceImpl = new PersonServiceImpl();
		boolean flag = personServiceImpl.deletePersonById(2);
		if (flag) {
			System.out.println("Deleted");
		} else {
			System.out.println("No person found with given id");
		}
	}
}
