package com.axis.manipal.appointment.Entity;



import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "appointment_id")
	private Long appointmentId;

	
	@CreatedDate
	@Column(name = "appointment_date")
	private Date appointmentDate;

	@CreationTimestamp
	@Column(name = "appointment_time")
	private Date appointmentTime;

	@Column(name = "status")
	private String status;

	@ManyToOne
	@JoinColumn
	private Patient patient;

	@ManyToOne
	@JoinColumn
	private Doctor doctor;

	public Appointment() {
		super();
	}

	public Appointment(Long appointmentId, Date appointmentDate, Date appointmentTime, String status, Patient patient,
			Doctor doctor) {
		super();
		this.appointmentId = appointmentId;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.status = status;
		this.patient = patient;
		this.doctor = doctor;
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

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	
	
	

}
