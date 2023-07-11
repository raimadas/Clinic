package com.axis.manipal.appointment.Dto;

import java.util.Date;

import org.hibernate.annotations.UpdateTimestamp;

public class AppointmentDateTimeStausUpdateDto {
	

	
	private Date appointmentDate;
	private Date appointmentTime;
	private String status;
	
	
	public AppointmentDateTimeStausUpdateDto(Date appointmentDate, Date appointmentTime, String status) {
		super();
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.status = status;
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
	
	
}
