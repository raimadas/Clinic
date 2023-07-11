package com.axis.manipal.reminder.Entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.*;

	
	@Entity
	@Table(name = "appointment")
	public class Appointment {
		
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="appointment_id")
	    private Long appointmentId;
	    

		@Column(name = "appointment_date")
		private String appointmentDate;

		@Column(name = "appointment_time")
		private String appointmentTime;

		@Column(name = "status")
		private String status;


	    // Other appointment fields

	    @OneToMany(mappedBy = "appointment", cascade = CascadeType.ALL)
	    private List<Reminder> reminders = new ArrayList<>();

	    // Constructors, getters, and setters

	    public void addReminder(Reminder reminder) {
	        reminders.add(reminder);
	        reminder.setAppointment(this);
	    }

	    public void removeReminder(Reminder reminder) {
	        reminders.remove(reminder);
	        reminder.setAppointment(null);
	    }

		public Appointment() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Appointment(Long appointmentId, String appointmentDate, String appointmentTime, String status,
				List<Reminder> reminders) {
			super();
			this.appointmentId = appointmentId;
			this.appointmentDate = appointmentDate;
			this.appointmentTime = appointmentTime;
			this.status = status;
			this.reminders = reminders;
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

		public List<Reminder> getReminders() {
			return reminders;
		}

		public void setReminders(List<Reminder> reminders) {
			this.reminders = reminders;
		}
	    
	    
	    
	}
