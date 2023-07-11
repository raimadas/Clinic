package com.axis.manipal.Doctor.Dto;


public class UpdateDoctorDto {

	private String firstName;

	private String lastName;

	private String contactDetails;
	
	private String specialization;


	public UpdateDoctorDto(Long doctorId, String firstName, String lastName, String contactDetails, String specialization) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactDetails = contactDetails;
		this.specialization = specialization;
	}


	public UpdateDoctorDto() {
		// TODO Auto-generated constructor stub
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


	public String getSpecialization() {
		return specialization;
	}


	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	


}
