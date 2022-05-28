package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Branch;

public interface BranchDao {

	Branch saveBranch(int hospital_id, Branch branch);

	Branch getBranchById(int branch_id);

	List<Branch> getBranchByState(String state);

	Branch updateBranchById(int branch_id, Branch branch);

	boolean deleteBranchById(int branch_id);

	List<Branch> getAllBranches();

}
