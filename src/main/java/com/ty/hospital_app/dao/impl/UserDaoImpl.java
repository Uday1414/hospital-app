package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.UserDao;
import com.ty.hospital_app.dto.User;

public class UserDaoImpl implements UserDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public User saveUser(User user) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return entityManager.find(User.class, user.getUser_id());
	}

	@Override
	public User updateUser(int user_id, User u) {
		User user = entityManager.find(User.class, user_id);
		if (user != null) {
			u.setUser_id(user.getUser_id());
			entityTransaction.begin();
			entityManager.merge(user);
			entityTransaction.commit();
			return entityManager.find(User.class, u.getUser_id());
		} else {
			return null;
		}
	}

	@Override
	public boolean deleteUser(int user_id) {
		User user = entityManager.find(User.class, user_id);
		if (user != null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<User> getUserByRole(String user_role) {
		Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.user_role=?1");
		query.setParameter(1,user_role);
		return query.getResultList();
	}

	@Override
	public User getUserById(int user_id) {
		return entityManager.find(User.class, user_id);
	}

	@Override
	public List<User> getAllUser() {
		Query query = entityManager.createQuery("SELECT u FROM User u");
		return query.getResultList();
	}

	@Override
	public User validateUser(String user_email, String user_password) {
		Query query = entityManager.createQuery("SELECT u FROM User u.user_email=?1 AND u.user_password=?2");
		query.setParameter(1, user_email);
		query.setParameter(2, user_password);
		List<User> users= query.getResultList();
		return users.get(0);
	}

}
