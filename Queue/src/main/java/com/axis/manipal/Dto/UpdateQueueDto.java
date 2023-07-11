package com.axis.manipal.Dto;

public class UpdateQueueDto {
	
    private String queueNumber;
	
	private String queueStatus;

	public UpdateQueueDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UpdateQueueDto(String queueNumber, String queueStatus) {
		super();
		this.queueNumber = queueNumber;
		this.queueStatus = queueStatus;
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
	
	
	

}
