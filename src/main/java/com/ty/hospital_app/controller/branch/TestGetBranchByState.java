package com.ty.hospital_app.controller.branch;

import java.util.List;

import com.ty.hospital_app.dao.impl.BranchDaoImpl;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;

public class TestGetBranchByState {
	public static void main(String[] args) {
		BranchDaoImpl branchDaoImpl = new BranchDaoImpl();
		List<Branch> branches = branchDaoImpl.getBranchByState("Karnataka");
		if (branches.size() > 0) {
			for (Branch branch : branches) {
				System.out.println(branch.getBranchName());
				Hospital hospital = branch.getHospital();
				Address address = branch.getAddress();
				if (hospital != null) {
					System.out.println(hospital.getHospital_name());
				}
				if (address != null) {
					System.out.println(address.getState());
				}
			}

		} else {
			System.out.println("No branch found");
		}
	}
}
