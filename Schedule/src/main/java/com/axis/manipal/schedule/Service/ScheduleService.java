package com.axis.manipal.schedule.Service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.manipal.schedule.Dto.ScheduleDto;
import com.axis.manipal.schedule.Dto.ScheduleDto2;
import com.axis.manipal.schedule.Dto.ScheduleUpdateDto;
import com.axis.manipal.schedule.Entity.Doctor;
import com.axis.manipal.schedule.Entity.Schedule;
import com.axis.manipal.schedule.Repository.DoctorRepository;
import com.axis.manipal.schedule.Repository.ScheduleRepository;

@Service
public class ScheduleService {
	@Autowired
	ScheduleRepository scheduleRepository;
	
	@Autowired
	DoctorRepository docRepo;
	
	public String createSchedule(ScheduleDto scheduledto) {
		Long doctorId=scheduledto.getDoctorId();
		
		Schedule app=new Schedule();
		
		//for doctor
		Doctor doctor;
		doctor=docRepo.findById(doctorId).get();
		app.setDoctor(doctor);
		
		app.setDayOfWeek(scheduledto.getDayOfWeek());
		app.setAvailability(scheduledto.getAvailability());
		app.setTimeSlot(scheduledto.getTimeSlot());
		
		scheduleRepository.save(app);
		return "Schedule created successfully";
		
	}
	
	
	public ScheduleDto2 getScheduleById(Long scheduleId) {
		Schedule a= scheduleRepository.findById(scheduleId).get();
		ScheduleDto2 ap=new ScheduleDto2();
		ap.setScheduleId(a.getScheduleId());
		ap.setDayOfWeek(a.getDayOfWeek());
		ap.setAvailability(a.getAvailability());
		ap.setTimeSlot(a.getTimeSlot());
		ap.setDoctorId(a.getDoctor().getDoctorId());
		
		return ap;
	}
	
	
	public List<ScheduleDto2> getAllSchedules(){
		List<Schedule> scheduleList=scheduleRepository.findAll();
		
		List<ScheduleDto2> scheduleDtoList=new ArrayList<>();
		
		for(Schedule ap: scheduleList) {
			ScheduleDto2 app2=new ScheduleDto2();
			app2.setScheduleId(ap.getScheduleId());
			app2.setDayOfWeek(ap.getDayOfWeek());
			app2.setTimeSlot(ap.getTimeSlot());
			app2.setAvailability(ap.getAvailability());
			app2.setDoctorId(ap.getDoctor().getDoctorId());
			
			scheduleDtoList.add(app2);
		}
		
		return scheduleDtoList;
	}
	
	public String deleteScheduleById(Long scheduleId) {
		try {
			scheduleRepository.deleteById(scheduleId);
		}catch(Exception e) {
			return "Schedule not found";
		}
		return "Schedule deleted successfully";
	}
	
	
	public String updateSchedule(Long scheduleId, ScheduleUpdateDto ap2) {
		Schedule ap =scheduleRepository.findById(scheduleId).get();
		
		ap.setAvailability(ap2.getAvailability());
		ap.setDayOfWeek(ap2.getDayOfWeek());
		ap.setTimeSlot(ap2.getTimeSlot());
		
		scheduleRepository.save(ap);
		
		return "Schedule Updated Successfully";
	}

}
