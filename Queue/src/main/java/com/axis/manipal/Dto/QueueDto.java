package com.axis.manipal.Dto;



public class QueueDto {
	
    private Long queueId;
	
	private String queueNumber;
	
	private String queueStatus;
	
	private AppointmentDto apList;

	public QueueDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QueueDto(Long queueId, String queueNumber, String queueStatus, AppointmentDto apList) {
		super();
		this.queueId = queueId;
		this.queueNumber = queueNumber;
		this.queueStatus = queueStatus;
		this.apList = apList;
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

	public AppointmentDto getApList() {
		return apList;
	}

	public void setApList(AppointmentDto apList) {
		this.apList = apList;
	}
	
	

}
