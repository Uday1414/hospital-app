package com.ty.hospital_app.controller.observation;

import java.time.LocalDateTime;

import com.ty.hospital_app.dto.Observation;
import com.ty.hospital_app.service.Impl.ObservationServiceImpl;

public class TestSaveObservation {
	 public static void main(String[] args) {
		Observation observation = new Observation();
		observation.setDateAndTime(LocalDateTime.now());
		observation.setRemarks("workinskdndkjsstion");
		observation.setStatus("normasdsvsdcl");
		
		ObservationServiceImpl observationServiceImpl = new ObservationServiceImpl();
		Observation observation2 = observationServiceImpl.saveObservation(observation, 10);
		if(observation2!=null) {
			System.out.println("Saved");
		}else {
			System.out.println("Not saved");
		}
	}
}
