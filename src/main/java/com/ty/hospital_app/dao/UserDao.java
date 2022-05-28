package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.User;

public interface UserDao {

	User saveUser(User user);

	User updateUser(int user_id, User u);

	boolean deleteUser(int user_id);

	List<User> getUserByRole(String user_role);

	User getUserById(int user_id);

	List<User> getAllUser();

	User validateUser(String user_email, String user_password);
}
