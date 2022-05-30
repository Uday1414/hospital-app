package com.ty.hospital_app.controller.hospital;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.Impl.HospitalServiceImpl;

public class TestUpdateHospitalById {
	//this class is for testing updateHospitalById.
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.setHospital_name("Apollo");
		hospital.setHospital_website("www.apollo.com");
		hospital.setHospital_gstnumber("APl123557HJD");
		
		HospitalServiceImpl hospitalServiceImpl = new HospitalServiceImpl();
		Hospital hospital2 = hospitalServiceImpl.updateHospitalById(2,hospital);
		if(hospital2!=null) {
			System.out.println("updated");
		}else {
			System.out.println("No hospital with given id");
		}
	}
}
