package com.ty.hospital_app.controller.user;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.User;
import com.ty.hospital_app.service.Impl.UserServiceImpl;

public class TestvalidateUser {
	public static void main(String[] args) {
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		User user = userServiceImpl.validateUser("uda@mail.com","uday@1414");
		if(user!=null) {
			System.out.println("User name : "+user.getUser_name());
			Branch branch = user.getBranch();
			System.out.println("Branch Name : "+branch.getBranchName());
		}else {
			System.out.println("Email or password wrong");
		}
	}
}
