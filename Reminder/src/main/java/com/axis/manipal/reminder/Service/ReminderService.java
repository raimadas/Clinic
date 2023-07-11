package com.axis.manipal.reminder.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.manipal.reminder.Dto.AppointmentDto;
import com.axis.manipal.reminder.Dto.ReminderDto;
import com.axis.manipal.reminder.Dto.ReminderEntryDto;
import com.axis.manipal.reminder.Dto.UpdateReminderDto;
import com.axis.manipal.reminder.Entity.Appointment;
import com.axis.manipal.reminder.Entity.Reminder;
import com.axis.manipal.reminder.Repository.AppointmentRepository;
import com.axis.manipal.reminder.Repository.ReminderRepository;

@Service
public class ReminderService {
	@Autowired
    ReminderRepository reminderRepository;
	
	@Autowired
	AppointmentRepository ar;

    public ReminderService(ReminderRepository reminderRepository) {
        this.reminderRepository = reminderRepository;
    }

    public String createReminder(ReminderEntryDto reminder) {
        // Logic to create a reminder
    	Appointment ad = ar.findById(reminder.getAppointmentId()).get();
    	Reminder rd = new Reminder();
    	rd.setReminderDate(reminder.getReminderDate());
    	rd.setReminderType(reminder.getReminderType());
    	rd.setAppointment(ad);
    	reminderRepository.save(rd);
    	
        return "Reminder added successfully"; 
    }

    public ReminderDto getReminderById(Long reminderId) {
        // Logic to fetch a reminder by ID
    	Reminder rd = reminderRepository.findById(reminderId).get();
    	
    	Appointment ap = ar.findById(rd.getAppointment().getAppointmentId()).get();
    	
    	
    	ReminderDto rdt = new ReminderDto();
    	
    	// appointment dto set
    	AppointmentDto ad = new AppointmentDto();
    	ad.setAppointmentDate(ap.getAppointmentDate());
    	ad.setAppointmentId(ap.getAppointmentId());
    	ad.setAppointmentTime(ap.getAppointmentDate());
    	ad.setStatus(ap.getStatus());
    	
    	
    	// reminder dto set
    	rdt.setReminderType(rd.getReminderType());
    	rdt.setReminderId(rd.getReminderId());
    	rdt.setReminderDate(rd.getReminderDate());
    	rdt.setApList(ad);
    	
        return rdt;
    }

    public String updateReminder(Long reminderId, UpdateReminderDto reminder) {
    
    	
    	try {
    		Reminder rd = reminderRepository.findById(reminderId).get();
    		
    		rd.setReminderDate(reminder.getReminderDate());
    		rd.setReminderType(reminder.getReminderType());
    		
    		reminderRepository.save(rd);
    	}catch(Exception e ) {
    		return "Reminder not found.";
    	}
    	return "Reminder was updated successfully.";
        
    }

    public String deleteReminder(Long reminderId) {
        // Logic to delete a reminder
    	
    	try {
    		reminderRepository.deleteById(reminderId);
    		
    	}catch(Exception e ) {
    		return "Reminder not found.";
    	}
    	return "Reminder deleted successfully.";
    }

	public List<ReminderDto> getAllReminders() {
		// TODO Auto-generated method stub
		List<Reminder> rd = reminderRepository.findAll();
		
		List<ReminderDto> rdt =  new ArrayList<>();
		
		for(Reminder rd1 : rd) {
			
			Appointment ap = ar.findById(rd1.getAppointment().getAppointmentId()).get();
			
			AppointmentDto apdt = new AppointmentDto();
			apdt.setAppointmentDate(ap.getAppointmentDate());
			apdt.setAppointmentId(ap.getAppointmentId());
			apdt.setAppointmentTime(ap.getAppointmentTime());
			apdt.setStatus(ap.getStatus());
			
			ReminderDto rd2 = new ReminderDto();
			rd2.setReminderDate(rd1.getReminderDate());
			rd2.setReminderId(rd1.getReminderId());
			rd2.setReminderType(rd1.getReminderType());
			rd2.setApList(apdt);
			
			rdt.add(rd2);
			
		}
		return rdt;
	}
}


