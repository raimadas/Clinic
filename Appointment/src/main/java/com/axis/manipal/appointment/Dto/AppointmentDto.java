package com.axis.manipal.appointment.Dto;

import java.util.Date;

public class AppointmentDto {
	

	


	
	private String status;


	private Long patientId;

	
	private Long doctorId;


	public AppointmentDto( Date appointmentDate, Date appointmentTime, String status,
			Long patientId, Long doctorId) {
		super();
		
		this.status = status;
		this.patientId = patientId;
		this.doctorId = doctorId;
	}


	public AppointmentDto() {
		super();
		// TODO Auto-generated constructor stub
	}






	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Long getPatientId() {
		return patientId;
	}


	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}


	public Long getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}


	
}
