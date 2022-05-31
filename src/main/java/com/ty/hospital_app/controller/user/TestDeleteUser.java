package com.ty.hospital_app.controller.user;

import com.ty.hospital_app.service.Impl.UserServiceImpl;

public class TestDeleteUser {
	public static void main(String[] args) {
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		boolean flag = userServiceImpl.deleteUser(2);
		if(flag) {
			System.out.println("Deleted");
		}else {
			System.out.println("No User");
		}
	}
}
