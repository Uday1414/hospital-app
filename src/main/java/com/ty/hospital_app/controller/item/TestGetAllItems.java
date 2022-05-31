package com.ty.hospital_app.controller.item;

import java.util.List;

import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.service.Impl.ItemServiceImpl;

public class TestGetAllItems {
	public static void main(String[] args) {
		ItemServiceImpl itemServiceImpl = new ItemServiceImpl();
		List<Item> items = itemServiceImpl.getAllItems(1);
		if(items.size()>0) {
			for (Item item : items) {
				System.out.println(item.getItem_name());
			}
		}else {
			System.out.println("No items with given med Id");
		}
	}
}
