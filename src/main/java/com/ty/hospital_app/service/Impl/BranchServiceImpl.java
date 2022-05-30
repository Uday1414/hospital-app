package com.ty.hospital_app.service.Impl;

import java.util.List;

import com.ty.hospital_app.dao.impl.BranchDaoImpl;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.service.BranchService;

public class BranchServiceImpl implements BranchService {
	BranchDaoImpl  branchDaoImpl = new BranchDaoImpl();
	public Branch saveBranch(int hospital_id, Branch branch) {
		
		return branchDaoImpl.saveBranch(hospital_id, branch);
	}

	public Branch getBranchById(int branch_id) {
		return branchDaoImpl.getBranchById(branch_id);
	}

	public List<Branch> getBranchByState(String state) {
		return branchDaoImpl.getBranchByState(state);
	}

	public Branch updateBranchById(int branch_id, Branch branch) {
		return branchDaoImpl.updateBranchById(branch_id, branch);
	}

	public boolean deleteBranchById(int branch_id) {
		return branchDaoImpl.deleteBranchById(branch_id);
	}

	public List<Branch> getAllBranchesByhospiptalId(int hospital_id) {
		return branchDaoImpl.getAllBranchesByhospiptalId(hospital_id);
	}

}
