package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dto.Encounter;

public interface EncounterService {
	Encounter saveEncounter(int branch_id, int person_id, Encounter encounter);

	List<Encounter> getAllEncounterByPersonId(int person_id);

	Encounter getEncounterById(int encounter_id);

	boolean deleteEncounterById(int encounter_id);

	Encounter updateEncounterById(int encounter_id, Encounter encounter);
}
