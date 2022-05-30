package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dto.Observation;

public interface ObservationService {
	Observation saveObservation(Observation observation, int encouonter_id);

	List<Observation> getAllObservation(int encounter_id);

	boolean deleteObservation(int observation_id);

}
