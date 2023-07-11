package com.axis.manipal.reminder.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reminder")
public class Reminder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reminderId;
    
    @Column(name="reminder_type")
    private String reminderType;
    
    @Column(name="reminder_date")
    private String reminderDate;

    @ManyToOne
    @JoinColumn
    private Appointment appointment;

	public Reminder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reminder(Long reminderId, String reminderType, String reminderDate, Appointment appointment) {
		super();
		this.reminderId = reminderId;
		this.reminderType = reminderType;
		this.reminderDate = reminderDate;
		this.appointment = appointment;
	}

	public Long getReminderId() {
		return reminderId;
	}

	public void setReminderId(Long reminderId) {
		this.reminderId = reminderId;
	}

	public String getReminderType() {
		return reminderType;
	}

	public void setReminderType(String reminderType) {
		this.reminderType = reminderType;
	}

	public String getReminderDate() {
		return reminderDate;
	}

	public void setReminderDate(String reminderDate) {
		this.reminderDate = reminderDate;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

    // Constructors, getters, and setters
    
    
    
}
