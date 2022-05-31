package com.ty.hospital_app.controller.item;

import com.ty.hospital_app.service.Impl.ItemServiceImpl;

public class TestDeleteItem {
	public static void main(String[] args) {
		ItemServiceImpl itemServiceImpl = new ItemServiceImpl();
		boolean flag = itemServiceImpl.deleteItemById(4);
		if(flag) {
			System.out.println("Deleted");
		}else {
			System.out.println("Not Found");
		}
	}
}
