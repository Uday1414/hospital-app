package com.ty.hospital_app.controller.encounter;

import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.service.Impl.EncounterServiceImpl;

public class TestGetEncounterById {
	public static void main(String[] args) {
		EncounterServiceImpl encounterServiceImpl = new EncounterServiceImpl();
		Encounter encounter = encounterServiceImpl.getEncounterById(2);
		if(encounter!=null){
			System.out.println("Encounter Reason : "+encounter.getReason());
		}
		else {
			System.out.println("No encounter with given id");
		}
	}
}
