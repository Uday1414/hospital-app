package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital_app.dao.ItemDao;
import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.MedOrder;

public class ItemDaoImpl implements ItemDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public Item saveItem(Item item) {
		entityTransaction.begin();
		entityManager.persist(item);
		entityTransaction.commit();
		return entityManager.find(Item.class, item.getItem_id());
	}

	@Override
	public Item getItemById(int item_id) {
		return entityManager.find(Item.class, item_id);
	}

	@Override
	public boolean deleteItemById(int item_id) {
		Item item = entityManager.find(Item.class, item_id);
		if (item != null) {
			entityTransaction.begin();
			entityManager.remove(item);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Item updateItemById(int item_id, Item item) {
		Item item1 = entityManager.find(Item.class, item_id);
		if (item1 != null) {
			item.setItem_id(item1.getItem_id());
			item.setMedOrder(item1.getMedOrder());
			entityTransaction.begin();
			entityManager.merge(item);
			entityTransaction.commit();
			return entityManager.find(Item.class, item.getItem_id());
		} else {
			return null;
		}
	}

	@Override
	public List<Item> getAllItems(int medOrder_id) {
		MedOrder medOrder = entityManager.find(MedOrder.class, medOrder_id);

		return medOrder.getItems();
	}

}
