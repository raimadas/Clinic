package com.axis.manipal.reminder.Dto;

public class ReminderEntryDto {
	 private Long reminderId;
	    
	 
	    private String reminderType;
	    
	  
	    private String reminderDate;

	    
	    private Long appointmentId;


		public ReminderEntryDto() {
			super();
			// TODO Auto-generated constructor stub
		}


		public ReminderEntryDto(Long reminderId, String reminderType, String reminderDate, Long appointmentId) {
			super();
			this.reminderId = reminderId;
			this.reminderType = reminderType;
			this.reminderDate = reminderDate;
			this.appointmentId = appointmentId;
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


		public Long getAppointmentId() {
			return appointmentId;
		}


		public void setAppointmentId(Long appointmentId) {
			this.appointmentId = appointmentId;
		}
	    
	    
		

}
