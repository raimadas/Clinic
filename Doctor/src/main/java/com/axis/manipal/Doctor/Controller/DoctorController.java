package com.axis.manipal.Doctor.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.axis.manipal.Doctor.Dto.DoctorDto;
import com.axis.manipal.Doctor.Dto.UpdateDoctorDto;
import com.axis.manipal.Doctor.Entity.Doctor;
import com.axis.manipal.Doctor.Service.DoctorService;




@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	private DoctorService doctorService;

	@PostMapping("/add")
	public ResponseEntity<String> addDoctor(@RequestBody Doctor doctor) {
		String savedDoctor = doctorService.addDoctor(doctor);
		return new ResponseEntity<>(savedDoctor, HttpStatus.CREATED);
	}

	@GetMapping("/get/{doctorId}")
	public ResponseEntity<Doctor> getDoctor(@PathVariable Long doctorId) {
		Doctor doctor = doctorService.getDoctor(doctorId);
		return new ResponseEntity<>(doctor, HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<DoctorDto>> getAllDoctors() {
		
		List<DoctorDto> doctors = doctorService.getAllDoctors();
		return new ResponseEntity<>(doctors, HttpStatus.OK);
		
	}

	@DeleteMapping("/delete/{doctorId}")
	public ResponseEntity<String> deleteDoctor(@PathVariable Long doctorId) {
		String result = doctorService.deleteDoctor(doctorId);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@PutMapping("/update/{doctorId}")
	public ResponseEntity<String> updateDoctor(@PathVariable Long doctorId, @RequestBody UpdateDoctorDto doctor) {
	     String  updatedDoctor = doctorService.updateDoctor(doctorId, doctor);
		return new ResponseEntity<>(updatedDoctor, HttpStatus.OK);
	}

}

