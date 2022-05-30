package com.ty.hospital_app.controller.encounter;

import java.util.List;

import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.service.Impl.EncounterServiceImpl;

public class TestGetAllEncountersByPersonId {
	public static void main(String[] args) {
		EncounterServiceImpl encounterServiceImpl = new EncounterServiceImpl();
		List<Encounter> encounters = encounterServiceImpl.getAllEncounterByPersonId(1);
		for (Encounter encounter : encounters) {
			System.out.println("Encounter Reason : "+encounter.getReason());
		}
	}
}
