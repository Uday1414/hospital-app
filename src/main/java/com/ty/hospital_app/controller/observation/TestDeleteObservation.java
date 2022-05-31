package com.ty.hospital_app.controller.observation;

import com.ty.hospital_app.service.Impl.ObservationServiceImpl;

public class TestDeleteObservation {
	public static void main(String[] args) {
		ObservationServiceImpl observationServiceImpl = new ObservationServiceImpl();
		boolean flag = observationServiceImpl.deleteObservation(3);
		if(flag) {
			System.out.println("Deleted");
		}else {
			System.out.println("No Observation found");
		}
	}
}
