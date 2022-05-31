package com.ty.hospital_app.controller.medOrder;

import com.ty.hospital_app.dto.MedOrder;
import com.ty.hospital_app.service.Impl.MedOrderServiceImpl;

public class TestUpdateMedOrder {
	public static void main(String[] args) {
		MedOrder medOrder = new MedOrder();
		medOrder.setTotal(610);
		
		MedOrderServiceImpl medOrderServiceImpl = new MedOrderServiceImpl();
		MedOrder medOrder2 = medOrderServiceImpl.updateMedOrderById(4, medOrder);
		if(medOrder2!=null) {
			System.out.println("Saved");
		}else {
			System.out.println("Not saved");
		}
	}
}
