package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dto.Item;

public interface ItemService {
	Item saveItem(Item item);

	Item getItemById(int item_id);

	boolean deleteItemById(int item_id);

	Item updateItemById(int item_id, Item item);

	List<Item> getAllItems(int medOrder_id);
}
