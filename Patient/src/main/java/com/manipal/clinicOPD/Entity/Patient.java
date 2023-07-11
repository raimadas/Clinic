package com.manipal.clinicOPD.Entity;



import javax.persistence.*;

@Entity
@Table(name = "patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "patient_id")
	private Long patientId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "contact_details")
	private String contactDetails;

	@Column(name = "medical_history")
	private String medicalHistory;

	@Column(name = "insurance_details")
	private String insuranceDetails;

	public Patient() {
		super();
	}

	public Patient(String firstName, String lastName, String contactDetails, String medicalHistory,
			String insuranceDetails) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactDetails = contactDetails;
		this.medicalHistory = medicalHistory;
		this.insuranceDetails = insuranceDetails;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

	public String getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	public String getInsuranceDetails() {
		return insuranceDetails;
	}

	public void setInsuranceDetails(String insuranceDetails) {
		this.insuranceDetails = insuranceDetails;
	}
}
