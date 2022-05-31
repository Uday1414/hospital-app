package com.ty.hospital_app.controller.user;

import com.ty.hospital_app.dto.User;
import com.ty.hospital_app.service.Impl.UserServiceImpl;

public class TestUpdateUser {
	public static void main(String[] args) {
		User user = new User();
		user.setUser_name("abhi");
		user.setUser_email("abhi@mail.com");
		user.setUser_phone(95545964878l);
		user.setUser_password("abhi@1414");
		user.setUser_role("nurse");
		
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		User user2 = userServiceImpl.updateUser(2, user);
		if(user2!=null) {
			System.out.println("Updated");
		}else {
			System.out.println("No user");
		}
	}
}
