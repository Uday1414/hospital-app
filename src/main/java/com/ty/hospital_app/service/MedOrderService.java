package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dto.MedOrder;

public interface MedOrderService {
	MedOrder saveMedOrder(int encounter_id, MedOrder medOrder);

	MedOrder getMedOrderById(int medOrder_id);

	List<MedOrder> getAllMedOrders(int encounter_id);

	MedOrder updateMedOrderById(int medOrder_id, MedOrder medOrder);

	boolean deleteMedOrderById(int medOrder_id);
}
