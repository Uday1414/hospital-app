package com.ty.hospital_app.controller.medOrder;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.MedOrder;
import com.ty.hospital_app.service.Impl.MedOrderServiceImpl;

public class TestSaveMedOrder {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		MedOrderServiceImpl medOrderServiceImpl = new MedOrderServiceImpl();
		List<Item> items = new ArrayList<>();
		items.add(entityManager.find(Item.class,1));
		items.add(entityManager.find(Item.class,2));
		items.add(entityManager.find(Item.class,3));
		MedOrder medOrder = new MedOrder();
		medOrder.setItems(items);
		double total = 0;
		for (Item item : items) {
			total += item.getItem_cost()*item.getItem_quantity();
		}
		medOrder.setTotal(500);
		MedOrder medOrder2 = medOrderServiceImpl.saveMedOrder(8, medOrder);
		if(medOrder2!=null) {
			System.out.println("Saved");
		}else {
			System.out.println("Not saved");
		}
		
	}
}
