package com.axis.manipal.schedule.Dto;

public class ScheduleUpdateDto {
private String dayOfWeek;
	
	private String timeSlot;
	
	private String availability;

	public ScheduleUpdateDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ScheduleUpdateDto(String dayOfWeek, String timeSlot, String availability) {
		super();
		this.dayOfWeek = dayOfWeek;
		this.timeSlot = timeSlot;
		this.availability = availability;
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
	
	

}
