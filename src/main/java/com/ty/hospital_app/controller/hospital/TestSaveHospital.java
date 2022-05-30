package com.ty.hospital_app.controller.hospital;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.Impl.HospitalServiceImpl;

public class TestSaveHospital {
	//this class is for testing saveHospital.
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.setHospital_name("Manipal");
		hospital.setHospital_website("www.Manipal.com");
		hospital.setHospital_gstnumber("MNPL885544AB");
		
		HospitalServiceImpl hospitalServiceImpl = new HospitalServiceImpl();
		Hospital hospital2=hospitalServiceImpl.saveHospital(hospital);
		if(hospital2!=null) {
			System.out.println("Saved");
		}else {
			System.out.println("Not Saved");
		}
	}
}
