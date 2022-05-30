package com.ty.hospital_app.controller.hospital;

import com.ty.hospital_app.service.Impl.HospitalServiceImpl;

public class TestDeleteHospitalById {
	//this class is for testing deleteHospitalById.
	public static void main(String[] args) {
		HospitalServiceImpl hospitalServiceImpl = new HospitalServiceImpl();
		boolean flag = hospitalServiceImpl.deleteHospitalById(2);
		if(flag) {
			System.out.println("deleted");
		}else{
			System.out.println("no hospital with given id");
		}
	}
}
