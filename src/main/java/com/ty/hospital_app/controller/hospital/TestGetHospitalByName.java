package com.ty.hospital_app.controller.hospital;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.Impl.HospitalServiceImpl;

public class TestGetHospitalByName {
	//this class is for testing getHospitalByName.
	public static void main(String[] args) {
		HospitalServiceImpl hospitalServiceImpl = new HospitalServiceImpl();
		Hospital hospital = hospitalServiceImpl.getHospitalByName("cloudnine");
		if(hospital!=null) {
			System.out.println("Hospital Name : "+hospital.getHospital_name());
			System.out.println("Hospital Website : "+hospital.getHospital_website());
			System.out.println("Hospital GST number  : "+hospital.getHospital_gstnumber());
		}else {
			System.out.println("No hospital with given name");
		}
	}
}
