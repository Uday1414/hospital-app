package com.ty.hospital_app.controller.user;

import java.util.List;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.User;
import com.ty.hospital_app.service.Impl.UserServiceImpl;

public class TestGetUserByRole {
	public static void main(String[] args) {
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		List<User> users = userServiceImpl.getUserByRole("doctor");
		if (users.size() > 0) {
			for (User user : users) {
				System.out.println("User name : " + user.getUser_name());
				Branch branch = user.getBranch();
				System.out.println("Branch Name : " + branch.getBranchName());
			}
		} else {
			System.out.println("No User found");
		}
	}
}
