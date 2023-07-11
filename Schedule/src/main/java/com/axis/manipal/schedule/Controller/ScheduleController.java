package com.axis.manipal.schedule.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.manipal.schedule.Dto.ScheduleDto;
import com.axis.manipal.schedule.Dto.ScheduleDto2;
import com.axis.manipal.schedule.Dto.ScheduleUpdateDto;
import com.axis.manipal.schedule.Service.ScheduleService;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
	
	@Autowired
	ScheduleService scheduleService;
	
	
	@PostMapping("/add")
	public ResponseEntity<String> createSchedule(@RequestBody ScheduleDto scheduledto){
		String createdSchedule=scheduleService.createSchedule(scheduledto);
		return new ResponseEntity<>(createdSchedule, HttpStatus.CREATED );
	}
	
	@GetMapping("get/{scheduleId}")
	public ResponseEntity<ScheduleDto2> getAppointmentById(@PathVariable Long scheduleId){
		ScheduleDto2 getSchedule=scheduleService.getScheduleById(scheduleId);
		return new ResponseEntity<>(getSchedule, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<ScheduleDto2>>getAllSchedules(){
		List<ScheduleDto2> schedules=scheduleService.getAllSchedules();
		return new ResponseEntity<>(schedules, HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{scheduleId}")
	public ResponseEntity<String> deleteScheduleById(@PathVariable Long scheduleId){
		String deleteSchedule=scheduleService.deleteScheduleById(scheduleId);
		return new ResponseEntity<>(deleteSchedule, HttpStatus.OK);
	}
    
	@PutMapping("update/{scheduleId}")
	public ResponseEntity<String> updateSchedule(@PathVariable Long scheduleId, @RequestBody ScheduleUpdateDto scheduleUpdateDto){
		String updateSchedule= scheduleService.updateSchedule(scheduleId, scheduleUpdateDto);
		return new ResponseEntity<>(updateSchedule, HttpStatus.OK);
	}
}
