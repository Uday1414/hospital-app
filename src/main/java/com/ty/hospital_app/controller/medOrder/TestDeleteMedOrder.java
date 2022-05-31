package com.ty.hospital_app.controller.medOrder;

import com.ty.hospital_app.service.Impl.MedOrderServiceImpl;

public class TestDeleteMedOrder {
	public static void main(String[] args) {
		MedOrderServiceImpl medOrderServiceImpl = new MedOrderServiceImpl();
		boolean flag = medOrderServiceImpl.deleteMedOrderById(4);
		if(flag) {
			System.out.println("Deleted");
		}else{
			System.out.println("Not found");
		}
	}
}
