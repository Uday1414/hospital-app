package com.ty.hospital_app.controller.branch;

import com.ty.hospital_app.service.Impl.BranchServiceImpl;

public class TestdeleteBranchById {
	public static void main(String[] args) {
		BranchServiceImpl branchServiceImpl = new BranchServiceImpl();
		boolean flag= branchServiceImpl.deleteBranchById(3);
		if (flag) {
			System.out.println("Deleted");
			
		} else {
			System.out.println("No branch found");
		}
	}
}
