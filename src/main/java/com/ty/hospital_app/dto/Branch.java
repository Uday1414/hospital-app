package com.ty.hospital_app.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//this entity creates branch table in database.
@Entity
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branch_id;
	private String branchName;
	private long branch_phone;
	private String branch_email;
	@OneToOne(mappedBy = "branch" , cascade = CascadeType.REMOVE)
	private Address address;
	@ManyToOne
	@JoinColumn
	private Hospital hospital;
	@OneToMany(mappedBy = "branch" , cascade = CascadeType.REMOVE)
	private List<Encounter> encounters;
	@OneToMany(mappedBy = "branch" , cascade = CascadeType.REMOVE)
	private List<User> users;

	public int getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public long getBranch_phone() {
		return branch_phone;
	}

	public void setBranch_phone(long branch_phone) {
		this.branch_phone = branch_phone;
	}

	public String getBranch_email() {
		return branch_email;
	}

	public void setBranch_email(String branch_email) {
		this.branch_email = branch_email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public List<Encounter> getEncounters() {
		return encounters;
	}

	public void setEncounters(List<Encounter> encounters) {
		this.encounters = encounters;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
