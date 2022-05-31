package com.ty.hospital_app.controller.medOrder;

import java.util.List;

import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.MedOrder;
import com.ty.hospital_app.service.Impl.MedOrderServiceImpl;

public class TestGetAllMedOrder {
	public static void main(String[] args) {
		MedOrderServiceImpl medOrderServiceImpl = new MedOrderServiceImpl();
		List<MedOrder> medOrders = medOrderServiceImpl.getAllMedOrders(8);
		if (medOrders.size() > 0) {
			for (MedOrder medOrder : medOrders) {
				System.out.println(medOrder.getTotal());
				Encounter encounter = medOrder.getEncounter();
				System.out.println(encounter.getReason());
			}
		} else {
			System.out.println("Not Found");
		}
	}
}
