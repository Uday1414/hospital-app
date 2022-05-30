package com.ty.hospital_app.service;

import com.ty.hospital_app.dto.Hospital;

public interface HospitalService {

	Hospital saveHospital(Hospital hospital);

	Hospital getHospitalById(int hospital_id);

	Hospital getHospitalByName(String hospital_name);

	Hospital updateHospitalById(int hospital_id, Hospital hospital);

	boolean deleteHospitalById(int hospital_id);
}
