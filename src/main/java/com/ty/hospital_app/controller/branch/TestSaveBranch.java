package com.ty.hospital_app.controller.branch;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.service.Impl.BranchServiceImpl;

public class TestSaveBranch {
	public static void main(String[] args) {
		Branch branch = new Branch();
		branch.setBranchName("Marathahalli");
		branch.setBranch_email("Mthcln@mail.com");
		branch.setBranch_phone(778556166);
		
		BranchServiceImpl branchServiceImpl = new BranchServiceImpl();
		
		Branch branch2=branchServiceImpl.saveBranch(1, branch);
		if(branch2!=null) {
			System.out.println("Saved");
		}else {
			System.out.println("Not Saved");
		}
	}
}
