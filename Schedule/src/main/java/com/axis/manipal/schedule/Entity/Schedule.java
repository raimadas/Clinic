package com.axis.manipal.schedule.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="schedule")
public class Schedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="schedule_id")
	private Long scheduleId;
	@Column(name="day_of_week")
	private String dayOfWeek;
	@Column(name="time_slot")
	private String timeSlot;
	@Column(name="availability")
	private String availability;
	
	//foreign key
	@ManyToOne
	@JoinColumn
	private Doctor doctor;

	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Schedule(Long scheduleId, String dayOfWeek, String timeSlot, String availability, Doctor doctor) {
		super();
		this.scheduleId = scheduleId;
		this.dayOfWeek = dayOfWeek;
		this.timeSlot = timeSlot;
		this.availability = availability;
		this.doctor = doctor;
	}

	public Long getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	

}
