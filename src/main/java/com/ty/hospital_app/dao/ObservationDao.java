package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Observation;

public interface ObservationDao {
	Observation saveObservation(Observation observation, int encouonter_id);

	List<Observation> getAllObservation(int encounter_id);

	boolean deleteObservation(int observation_id);

}
