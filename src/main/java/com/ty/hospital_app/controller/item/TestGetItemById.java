package com.ty.hospital_app.controller.item;

import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.service.Impl.ItemServiceImpl;

public class TestGetItemById {
	public static void main(String[] args) {
		ItemServiceImpl itemServiceImpl = new ItemServiceImpl();
		Item item = itemServiceImpl.getItemById(1);
		if (item != null) {
			System.out.println(item.getItem_name());
		} else {
			System.out.println("No Item");
		}
	}
}
