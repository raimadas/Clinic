package com.axis.manipal.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="queue")
public class Queue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long queueId;
	@Column(name="queue_Number")
	private String queueNumber;
	@Column(name="queue_status")
	private String queueStatus;
	
	@ManyToOne
	@JoinColumn
	private Appointment appointment;

	public Queue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Queue(Long queueId, String queueNumber, String queueStatus, Appointment appointment) {
		super();
		this.queueId = queueId;
		this.queueNumber = queueNumber;
		this.queueStatus = queueStatus;
		this.appointment = appointment;
	}

	public Long getQueueId() {
		return queueId;
	}

	public void setQueueId(Long queueId) {
		this.queueId = queueId;
	}

	public String getQueueNumber() {
		return queueNumber;
	}

	public void setQueueNumber(String queueNumber) {
		this.queueNumber = queueNumber;
	}

	public String getQueueStatus() {
		return queueStatus;
	}

	public void setQueueStatus(String queueStatus) {
		this.queueStatus = queueStatus;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	
	
	 
	 
}
