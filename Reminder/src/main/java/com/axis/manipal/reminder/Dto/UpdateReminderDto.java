package com.axis.manipal.reminder.Dto;



import java.util.ArrayList;
import java.util.List;

import com.axis.manipal.reminder.Entity.Appointment;

public class UpdateReminderDto {
	    private String reminderType;
	    private String reminderDate;
		public UpdateReminderDto() {
			super();
			// TODO Auto-generated constructor stub
		}
		public UpdateReminderDto(String reminderType, String reminderDate) {
			super();
			this.reminderType = reminderType;
			this.reminderDate = reminderDate;
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
	    
	    

}
