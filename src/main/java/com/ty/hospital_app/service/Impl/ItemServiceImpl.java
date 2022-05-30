package com.ty.hospital_app.service.Impl;

import java.util.List;

import com.ty.hospital_app.dao.impl.ItemDaoImpl;
import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.service.ItemService;

public class ItemServiceImpl implements ItemService {
	ItemDaoImpl implDaoImpl = new ItemDaoImpl();
	@Override
	public Item saveItem(Item item) {
		return implDaoImpl.saveItem(item);
	}

	@Override
	public Item getItemById(int item_id) {
		return implDaoImpl.getItemById(item_id);
	}

	@Override
	public boolean deleteItemById(int item_id) {
		return implDaoImpl.deleteItemById(item_id);
	}

	@Override
	public Item updateItemById(int item_id, Item item) {
		return implDaoImpl.updateItemById(item_id, item);
	}

	@Override
	public List<Item> getAllItems(int medOrder_id) {
		return implDaoImpl.getAllItems(medOrder_id);
	}

}
