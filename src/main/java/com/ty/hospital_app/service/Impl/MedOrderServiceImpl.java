package com.ty.hospital_app.service.Impl;

import java.util.List;

import com.ty.hospital_app.dao.impl.MedOrderDaoImpl;
import com.ty.hospital_app.dto.MedOrder;
import com.ty.hospital_app.service.MedOrderService;

public class MedOrderServiceImpl implements MedOrderService {
	MedOrderDaoImpl medOrderDaoImpl = new MedOrderDaoImpl();
	@Override
	public MedOrder saveMedOrder(int encounter_id, MedOrder medOrder) {
		return medOrderDaoImpl.saveMedOrder(encounter_id, medOrder);
	}

	@Override
	public MedOrder getMedOrderById(int medOrder_id) {
		return medOrderDaoImpl.getMedOrderById(medOrder_id);
	}

	@Override
	public List<MedOrder> getAllMedOrders(int encounter_id) {
		return medOrderDaoImpl.getAllMedOrders(encounter_id);
	}

	@Override
	public MedOrder updateMedOrderById(int medOrder_id, MedOrder medOrder) {
		return medOrderDaoImpl.updateMedOrderById(medOrder_id, medOrder);
	}

	@Override
	public boolean deleteMedOrderById(int medOrder_id) {
		return medOrderDaoImpl.deleteMedOrderById(medOrder_id);
	}

}
