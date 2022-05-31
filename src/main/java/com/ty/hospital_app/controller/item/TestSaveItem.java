package com.ty.hospital_app.controller.item;

import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.service.Impl.ItemServiceImpl;

public class TestSaveItem {
	public static void main(String[] args) {
		ItemServiceImpl implItemServiceImpl = new ItemServiceImpl();
		Item item = new Item();
		item.setItem_name("vicks");
		item.setItem_quantity(1);
		item.setItem_cost(5);
		
		if(implItemServiceImpl.saveItem(item)!=null) {
			System.out.println("Saved");
		}else {
			System.out.println("Not saved");
		}
			
	}
}
