package com.ty.hospital_app.service.Impl;

import java.util.List;

import com.ty.hospital_app.dao.impl.UserDaoImpl;
import com.ty.hospital_app.dto.User;
import com.ty.hospital_app.service.UserService;

public class UserServiceImpl implements UserService {
	UserDaoImpl userDaoImpl = new UserDaoImpl();
	

	@Override
	public User updateUser(int user_id, User u) {
		return userDaoImpl.updateUser(user_id, u);
	}

	@Override
	public boolean deleteUser(int user_id) {
		return userDaoImpl.deleteUser(user_id);
	}

	@Override
	public List<User> getUserByRole(String user_role) {
		return userDaoImpl.getUserByRole(user_role);
	}

	@Override
	public User getUserById(int user_id) {
		return userDaoImpl.getUserById(user_id);
	}

	@Override
	public List<User> getAllUser() {
		return userDaoImpl.getAllUser();
	}

	@Override
	public User validateUser(String user_email, String user_password) {
		return userDaoImpl.validateUser(user_email, user_password);
	}

	@Override
	public User saveUser(User user, int branch_id) {
		return userDaoImpl.saveUser(user, branch_id);
	}

}
