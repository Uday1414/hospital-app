package com.ty.hospital_app.controller.encounter;

import java.time.LocalDateTime;

import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.service.Impl.EncounterServiceImpl;

public class TestSaveEncounter {
	public static void main(String[] args) {
		Encounter encounter = new Encounter();
		encounter.setAdmitDateAndTime(LocalDateTime.now());
		encounter.setReason("dskjha");
		encounter.setDischargeDateAndTime(LocalDateTime.now());
		
		EncounterServiceImpl encounterServiceImpl = new EncounterServiceImpl();
		Encounter encounter2 = encounterServiceImpl.saveEncounter(1, 3, encounter);
		if(encounter2!=null) {
			System.out.println("Saved");
		}else {
			System.out.println("Not saved");
		}
	}
}
