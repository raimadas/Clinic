package com.axis.manipal.reminder.Dto;



import java.util.ArrayList;
import java.util.List;

import com.axis.manipal.reminder.Entity.Appointment;

public class ReminderDto {
	 private Long reminderId;
	    
	 
	    private String reminderType;
	    
	  
	    private String reminderDate;

	    
	    private AppointmentDto apList;
	    
	    
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
		
		public ReminderDto() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ReminderDto(Long reminderId, String reminderType, String reminderDate,
			AppointmentDto apList) {
			super();
			this.reminderId = reminderId;
			this.reminderType = reminderType;
			this.reminderDate = reminderDate;
			
			this.apList = apList;
		}
		public AppointmentDto getApList() {
			return apList;
		}
		public void setApList(AppointmentDto apList) {
			this.apList = apList;
		}

		
	    

}
