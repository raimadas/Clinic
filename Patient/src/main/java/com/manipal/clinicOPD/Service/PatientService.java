package com.manipal.clinicOPD.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.manipal.clinicOPD.Dto.PatientDto;
import com.manipal.clinicOPD.Dto.UpdatePatientDto;
import com.manipal.clinicOPD.Entity.Patient;
import com.manipal.clinicOPD.Repository.PatientRepository;



@Service
public class PatientService {
	@Autowired
	private PatientRepository patientRepository;

	public String addPatient(Patient patient) {
		 patientRepository.save(patient);
		 return "Patient Saved Successfully";
	}

	public Patient getPatient(Long patientId) {
		Patient pr;
		pr=patientRepository.findById(patientId).get();
		
		return pr;
	}

	public List<PatientDto> getAllPatients() {
List <Patient> dl = patientRepository.findAll();
    	
    	List<PatientDto> dt = new ArrayList<>();
    	
    	for(Patient d : dl) {
    		PatientDto d2 = new PatientDto();
    		
    		
    		d2.setFirstName(d.getFirstName());
    		d2.setLastName(d.getLastName());
    		d2.setPatientId(d.getPatientId());
    		d2.setContactDetails(d.getContactDetails());
    		d2.setMedicalHistory(d.getMedicalHistory());
    		d2.setInsuranceDetails(d.getInsuranceDetails());
    		
    		dt.add(d2);
    		
    	}
    	return dt;
			
		
	}

	public String deletePatient(Long patientId) {
		try {
			patientRepository.deleteById(patientId);
		}
		catch(Exception e ){
			return "Patient Not Found";
		}
		
		return "Patient successfully deleted.";
		
	}

	
	
	 
	public String updatePatient(Long patientId, UpdatePatientDto patient) {
		Patient dr;
		try {
			dr = patientRepository.findById(patientId).get();
			
			dr.setFirstName(patient.getFirstName());
			dr.setLastName(patient.getLastName());
			dr.setContactDetails(patient.getContactDetails());
			dr.setMedicalHistory(patient.getMedicalHistory());
			dr.setInsuranceDetails(patient.getInsuranceDetails());
		}catch(Exception e){
			return "Patient was not found";
		}
		patientRepository.save(dr);
		
		return "Patient updated successfully.";
	}

	 
}

