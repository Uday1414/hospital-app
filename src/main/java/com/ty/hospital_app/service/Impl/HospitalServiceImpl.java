package com.ty.hospital_app.service.Impl;

import com.ty.hospital_app.dao.impl.HospitalDaoImpl;
import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class HospitalServiceImpl implements HospitalService {
	//this class is used to write logics and call HospitalDaoImpl methods and return what they return to controller.
	
	HospitalDaoImpl hospitalDaoImpl = new HospitalDaoImpl();
	public Hospital saveHospital(Hospital hospital) {
		//call saveHospital(Hospital hospital) of HospitalDaoImp and returns it.
		return hospitalDaoImpl.saveHospital(hospital);
	}

	public Hospital getHospitalById(int hospital_id) {
		//call getHospitalById(int hospital_id) of HospitalDaoImp and returns it.
		return hospitalDaoImpl.getHospitalById(hospital_id);
	}

	public Hospital getHospitalByName(String hospital_name) {
		//call getHospitalByName(String hospital_name) of HospitalDaoImp and returns it.
		return hospitalDaoImpl.getHospitalByName(hospital_name);
	}

	public Hospital updateHospitalById(int hospital_id, Hospital hospital) {
		//call updateHospitalById(int hospital_id, Hospital hospital) of HospitalDaoImp and returns it.
		return hospitalDaoImpl.updateHospitalById(hospital_id, hospital);
	}

	public boolean deleteHospitalById(int hospital_id) {
		//call deleteHospitalById(int hospital_id) of HospitalDaoImp and returns it.
		return hospitalDaoImpl.deleteHospitalById(hospital_id);
	}

}
