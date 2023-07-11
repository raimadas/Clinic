package com.axis.manipal.reminder.Dto;


public class AppointmentDto {
	
    private Long appointmentId;
    

	private String appointmentDate;

	
	private String appointmentTime;

	
	private String status;


	public AppointmentDto(Long appointmentId, String appointmentDate, String appointmentTime, String status) {
		super();
		this.appointmentId = appointmentId;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.status = status;
	}


	public AppointmentDto() {
		// TODO Auto-generated constructor stub
	}


	public Long getAppointmentId() {
		return appointmentId;
	}


	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}


	public String getAppointmentDate() {
		return appointmentDate;
	}


	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}


	public String getAppointmentTime() {
		return appointmentTime;
	}


	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	



}
