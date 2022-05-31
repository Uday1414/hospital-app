package com.ty.hospital_app.controller.medOrder;

import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.MedOrder;
import com.ty.hospital_app.service.Impl.MedOrderServiceImpl;

public class TestGetMedOrderById {
	public static void main(String[] args) {
		MedOrderServiceImpl medOrderServiceImpl = new MedOrderServiceImpl();
		MedOrder medOrder = medOrderServiceImpl.getMedOrderById(1);
		if(medOrder!=null) {
			System.out.println(medOrder.getTotal());
			Encounter encounter = medOrder.getEncounter();
			System.out.println(encounter.getReason());
		}else {
			System.out.println("Not Found");
		}
	}
}
