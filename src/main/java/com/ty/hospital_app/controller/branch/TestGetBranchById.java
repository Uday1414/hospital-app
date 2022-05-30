package com.ty.hospital_app.controller.branch;

import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.Impl.BranchServiceImpl;

public class TestGetBranchById {
	public static void main(String[] args) {
		BranchServiceImpl branchServiceImpl = new BranchServiceImpl();
		Branch branch = branchServiceImpl.getBranchById(1);
		if (branch != null) {
			System.out.println(branch.getBranchName());
			Hospital hospital = branch.getHospital();
			Address address = branch.getAddress();
			if (hospital != null) {
				System.out.println(hospital.getHospital_name());
			}
			if(address!=null) {
				System.out.println(address.getState());
			}
		} else {
			System.out.println("No branch found");
		}
	}
}
