package com.axis.manipal.appointment.Dto;

import java.util.Date;

public class AppointmentDto2 {
	

	private Long appointmentId;
	private Date appointmentDate;
	private Date appointmentTime;
	private String status;
	private Long patientId;
	private Long doctorId;
	public AppointmentDto2(Long appointmentId, Date appointmentDate, Date appointmentTime, String status,
			Long patientId, Long doctorId) {
		super();
		this.appointmentId = appointmentId;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.status = status;
		this.patientId = patientId;
		this.doctorId = doctorId;
	}
	
	
	public AppointmentDto2() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public Date getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(Date appointmentTime) {
		this.appointmentTime = appointmentTime;
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
