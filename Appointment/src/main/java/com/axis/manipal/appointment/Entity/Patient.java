package com.axis.manipal.appointment.Entity;



import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Appointment> appointments;
    
 // Constructors, getters, and setters

	public Patient(Long patientId, String firstName, String lastName, String contactDetails, String medicalHistory,
			String insuranceDetails, List<Appointment> appointments) {
		super();
		this.patientId = patientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactDetails = contactDetails;
		this.medicalHistory = medicalHistory;
		this.insuranceDetails = insuranceDetails;
		this.appointments = appointments;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
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

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

    
    
    
}
