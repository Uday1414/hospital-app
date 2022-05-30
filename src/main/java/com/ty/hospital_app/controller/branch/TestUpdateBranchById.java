package com.ty.hospital_app.controller.branch;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.service.Impl.BranchServiceImpl;

public class TestUpdateBranchById {
	public static void main(String[] args) {
		BranchServiceImpl branchServiceImpl = new BranchServiceImpl();
		Branch branch = new Branch();
		branch.setBranchName("Marathahalli");
		branch.setBranch_email("Marathallicln@mail.com");
		branch.setBranch_phone(778556166);
		Branch branch2 = branchServiceImpl.updateBranchById(2,branch );
		if(branch2!=null) {
			System.out.println("updated");
		}else {
			System.out.println("no branch found with given id");
		}
	}
}
