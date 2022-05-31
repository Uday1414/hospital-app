package com.ty.hospital_app.controller.observation;

import java.util.List;

import com.ty.hospital_app.dto.Observation;
import com.ty.hospital_app.service.Impl.ObservationServiceImpl;

public class TestGetAllObservation {
	public static void main(String[] args) {
		ObservationServiceImpl observationServiceImpl = new ObservationServiceImpl();
		List<Observation> observations = observationServiceImpl.getAllObservation(10);
		if (observations.size() > 0) {
			for (Observation observation : observations) {
				System.out.println(observation.getDateAndTime());
				System.out.println(observation.getStatus());
				System.out.println("-----------------------------");
			}
		}else {
			System.out.println("No Encounter found");
		}
	}
}
