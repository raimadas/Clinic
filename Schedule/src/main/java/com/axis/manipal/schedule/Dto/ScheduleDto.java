package com.axis.manipal.schedule.Dto;



public class ScheduleDto {
	private String dayOfWeek;

    private String timeSlot;

    private String availability;
    
    private Long doctorId;

	public ScheduleDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ScheduleDto(String dayOfWeek, String timeSlot, String availability, Long doctorId) {
		super();
		this.dayOfWeek = dayOfWeek;
		this.timeSlot = timeSlot;
		this.availability = availability;
		this.doctorId = doctorId;
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

	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}
    
    

	

}
