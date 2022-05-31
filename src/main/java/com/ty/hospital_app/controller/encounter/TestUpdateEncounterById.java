package com.ty.hospital_app.controller.encounter;

import java.time.LocalDateTime;

import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.service.Impl.EncounterServiceImpl;

public class TestUpdateEncounterById {
	public static void main(String[] args) {
		EncounterServiceImpl encounterServiceImpl = new EncounterServiceImpl();
		Encounter encounter = new Encounter();
		encounter.setAdmitDateAndTime(LocalDateTime.now());
		encounter.setReason("cancer");
		encounter.setDischargeDateAndTime(LocalDateTime.now());
		Encounter encounter1 = encounterServiceImpl.updateEncounterById(10, encounter);
		if(encounter1!=null) {
			System.out.println("Updated");
		}else {
			System.out.println("No encounter with given id");
		}
	}
}
