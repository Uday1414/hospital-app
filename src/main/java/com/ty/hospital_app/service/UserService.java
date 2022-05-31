package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dto.User;

public interface UserService {

	User saveUser(User user , int branch_id);

	User updateUser(int user_id, User u);

	boolean deleteUser(int user_id);

	List<User> getUserByRole(String user_role);

	User getUserById(int user_id);

	List<User> getAllUser();

	User validateUser(String user_email, String user_password);
}
