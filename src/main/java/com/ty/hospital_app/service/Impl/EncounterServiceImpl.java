package com.ty.hospital_app.service.Impl;

import java.util.List;

import com.ty.hospital_app.dao.impl.EncounterDaoImpl;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.service.EncounterService;

public class EncounterServiceImpl implements EncounterService {
	
	EncounterDaoImpl encounterDaoImpl = new EncounterDaoImpl();
	@Override
	public Encounter saveEncounter(int branch_id, int person_id, Encounter encounter) {
		return encounterDaoImpl.saveEncounter(branch_id, person_id, encounter);
	}

	@Override
	public List<Encounter> getAllEncounterByPersonId(int person_id) {
		return encounterDaoImpl.getAllEncounterByPersonId(person_id);
	}

	@Override
	public Encounter getEncounterById(int encounter_id) {
		return encounterDaoImpl.getEncounterById(encounter_id);
	}

	@Override
	public boolean deleteEncounterById(int encounter_id) {
		return encounterDaoImpl.deleteEncounterById(encounter_id);
	}

	@Override
	public Encounter updateEncounterById(int encounter_id, Encounter encounter) {
		return encounterDaoImpl.updateEncounterById(encounter_id, encounter);
	}

}
