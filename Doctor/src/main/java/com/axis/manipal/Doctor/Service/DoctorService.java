package com.axis.manipal.Doctor.Service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.manipal.Doctor.Dto.DoctorDto;
import com.axis.manipal.Doctor.Dto.UpdateDoctorDto;
import com.axis.manipal.Doctor.Entity.Doctor;
import com.axis.manipal.Doctor.Repository.DoctorRepository;



@Service
public class DoctorService {
	@Autowired
	private DoctorRepository doctorRepository;

	public String addDoctor(Doctor doctor) {
		doctorRepository.save(doctor);
		return "Doctor saved Successfully.";
	}

	public Doctor getDoctor(Long doctorId) {
		Doctor dr;
		dr = doctorRepository.findById(doctorId).get();
		
		return dr;
	}

	public List<DoctorDto> getAllDoctors() {
List <Doctor> dl = doctorRepository.findAll();
    	
    	List<DoctorDto> dt = new ArrayList<>();
    	
    	for(Doctor d : dl) {
    		DoctorDto d2 = new DoctorDto();
    		d2.setDoctorId(d.getDoctorId());
    		d2.setContactDetails(d.getContactDetails());
    		d2.setFirstName(d.getFirstName());
    		d2.setLastName(d.getLastName());
    		d2.setSpecialization(d.getSpecialization());
    		
    		dt.add(d2);
    		
    	}
    	return dt;
  
	}

	public String deleteDoctor(Long doctorId) {
		try {
			doctorRepository.deleteById(doctorId);
		}catch(Exception e) {
			return "Doctor was not found";
		}
		return "Doctor successfully deleted.";
	}

	public String updateDoctor(Long doctorId, UpdateDoctorDto doctor) {
		Doctor dr;
		try {
			dr = doctorRepository.findById(doctorId).get();
			dr.setContactDetails(doctor.getContactDetails());
			dr.setFirstName(doctor.getFirstName());
			dr.setLastName(doctor.getLastName());
			dr.setSpecialization(doctor.getSpecialization());
		}catch(Exception e){
			return "Doctor was not found";
		}
		doctorRepository.save(dr);
		
		return "Doctor updated successfully.";
	}
}

