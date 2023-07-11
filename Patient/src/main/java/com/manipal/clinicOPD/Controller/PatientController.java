package com.manipal.clinicOPD.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.manipal.clinicOPD.Dto.PatientDto;
import com.manipal.clinicOPD.Dto.UpdatePatientDto;
import com.manipal.clinicOPD.Entity.Patient;
import com.manipal.clinicOPD.Service.PatientService;


@CrossOrigin(origins="http://localhost:3001")
@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	private PatientService patientService;

	@PostMapping("/add")
	public ResponseEntity<String> addPatient(@RequestBody Patient patient) {
		String savedPatient = patientService.addPatient(patient);
		return new ResponseEntity<>(savedPatient, HttpStatus.CREATED);
	}

	@GetMapping("/get/{patientId}")
	public ResponseEntity<Patient> getPatient(@PathVariable Long patientId) {
		Patient patient = patientService.getPatient(patientId);
		return new ResponseEntity<>(patient, HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<PatientDto>> getAllPatients() {
		
		List<PatientDto> patients = patientService.getAllPatients();
		return new ResponseEntity<>(patients, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{patientId}")
	public ResponseEntity<String> deletePatient(@PathVariable Long patientId) {
		String result = patientService.deletePatient(patientId);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	

	@PutMapping("/update/{patientId}")
	public ResponseEntity<String> updatePatient(@PathVariable Long patientId, @RequestBody UpdatePatientDto patient) {
		String updatedPatient = patientService.updatePatient(patientId, patient);
		return new ResponseEntity<>(updatedPatient, HttpStatus.OK);
	}
}
