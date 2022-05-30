package com.ty.hospital_app.service.Impl;

import java.util.List;

import com.ty.hospital_app.dao.impl.ObservationDaoImpl;
import com.ty.hospital_app.dto.Observation;
import com.ty.hospital_app.service.ObservationService;

public class ObservationServiceImpl implements ObservationService {
	ObservationDaoImpl observationDaoImpl = new ObservationDaoImpl();
	@Override
	public Observation saveObservation(Observation observation, int encouonter_id) {
		return observationDaoImpl.saveObservation(observation, encouonter_id);
	}

	@Override
	public List<Observation> getAllObservation(int encounter_id) {
		return observationDaoImpl.getAllObservation(encounter_id);
	}

	@Override
	public boolean deleteObservation(int observation_id) {
		return observationDaoImpl.deleteObservation(observation_id);
	}

}
