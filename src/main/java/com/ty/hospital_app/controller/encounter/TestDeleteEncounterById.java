package com.ty.hospital_app.controller.encounter;

import com.ty.hospital_app.service.Impl.EncounterServiceImpl;

public class TestDeleteEncounterById {
	public static void main(String[] args) {
		EncounterServiceImpl encounterServiceImpl = new EncounterServiceImpl();
		boolean flag = encounterServiceImpl.deleteEncounterById(7);
		if(flag) {
			System.out.println("Deleted");
		}else {
			System.out.println("No Encounter with given id");
		}
	}
}
