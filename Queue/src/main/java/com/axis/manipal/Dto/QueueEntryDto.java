package com.axis.manipal.Dto;



public class QueueEntryDto {
	
	private Long queueId;
	
	private String queueNumber;
	
	private String queueStatus;
	

	private Long appointmentId;


	public QueueEntryDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public QueueEntryDto(Long queueId, String queueNumber, String queueStatus, Long appointmentId) {
		super();
		this.queueId = queueId;
		this.queueNumber = queueNumber;
		this.queueStatus = queueStatus;
		this.appointmentId = appointmentId;
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


	public Long getAppointmentId() {
		return appointmentId;
	}


	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}
	
	


}
