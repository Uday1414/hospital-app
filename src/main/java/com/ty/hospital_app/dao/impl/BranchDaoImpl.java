package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.BranchDao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;

public class BranchDaoImpl implements BranchDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Branch saveBranch(int hospital_id, Branch branch) {
		Hospital hospital = entityManager.find(Hospital.class, hospital_id);
		branch.setHospital(hospital);
		entityTransaction.begin();
		entityManager.persist(branch);
		entityTransaction.commit();
		return entityManager.find(Branch.class, branch.getBranch_id());
	}

	public Branch getBranchById(int branch_id) {

		return entityManager.find(Branch.class, branch_id);
	}

	public List<Branch> getBranchByState(String state) {
		Query query = entityManager.createQuery("SELECT b FROM Branch b WHERE b.address.state=?1");
		query.setParameter(1, state);
		return query.getResultList();
	}

	public Branch updateBranchById(int branch_id, Branch branch) {
		Branch branch2 = entityManager.find(Branch.class, branch_id);
		if (branch2 != null) {
			branch.setBranch_id(branch_id);
			entityTransaction.begin();
			entityManager.merge(branch);
			entityTransaction.commit();
			return branch;
		} else {
			return null;
		}
	}

	public boolean deleteBranchById(int branch_id) {
		Branch branch= entityManager.find(Branch.class, branch_id);
		if (branch != null) {
			entityTransaction.begin();
			entityManager.remove(branch);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	public List<Branch> getAllBranchesByhospiptalId(int hospital_id) {
		String sql = "SELECT b FROM Branch b WHERE b.hospital.hospital_id=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, hospital_id);
		return query.getResultList();
	}

}
