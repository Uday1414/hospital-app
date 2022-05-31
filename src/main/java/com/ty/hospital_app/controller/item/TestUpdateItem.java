package com.ty.hospital_app.controller.item;

import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.service.Impl.ItemServiceImpl;

public class TestUpdateItem {
	public static void main(String[] args) {
		ItemServiceImpl implItemServiceImpl = new ItemServiceImpl();
		Item item = new Item();
		item.setItem_name("vicks");
		item.setItem_quantity(1);
		item.setItem_cost(5);
		
		if(implItemServiceImpl.updateItemById(4, item)!=null) {
			System.out.println("Saved");
		}else {
			System.out.println("Not saved");
		}
	}
}
