package com.axis.manipal.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//queue

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
	
	@OneToMany(mappedBy = "appointment", cascade = CascadeType.ALL)
    private List<Queue> queues = new ArrayList<>();

    // Constructors, getters, and setters

    public void addQueue(Queue queue) {
        queues.add(queue);
        queue.setAppointment(this);
    }

    public void removeQueue(Queue queue) {
        queues.remove(queue);
        queue.setAppointment(null);
    }

    //constructor

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(Long appointmentId, String appointmentDate, String appointmentTime, String status,
			List<Queue> queues) {
		super();
		this.appointmentId = appointmentId;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.status = status;
		this.queues = queues;
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

	public List<Queue> getQueues() {
		return queues;
	}

	public void setQueues(List<Queue> queues) {
		this.queues = queues;
	}
    
   
    


}
