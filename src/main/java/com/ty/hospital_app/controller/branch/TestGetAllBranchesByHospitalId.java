package com.ty.hospital_app.controller.branch;

import java.util.List;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.service.Impl.BranchServiceImpl;

public class TestGetAllBranchesByHospitalId {
	public static void main(String[] args) {
		BranchServiceImpl branchServiceImpl = new BranchServiceImpl();
		List<Branch> branchs = branchServiceImpl.getAllBranchesByhospiptalId(1);
		if (branchs.size() > 0) {
			for (Branch branch : branchs) {
				System.out.println(branch.getBranchName());
			}
		} else {
				System.out.println("No branches");
		}
	}
}
