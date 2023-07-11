package com.axis.manipal.appointment.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.axis.manipal.appointment.Dto.AppointmentDateTimeStausUpdateDto;
import com.axis.manipal.appointment.Dto.AppointmentDto;
import com.axis.manipal.appointment.Dto.AppointmentDto2;

import com.axis.manipal.appointment.Service.AppointmentService;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

   

    @PostMapping("/add")
    public ResponseEntity<String> createAppointment(@RequestBody AppointmentDto appointmentdto) {
        String createdAppointment = appointmentService.createAppointment(appointmentdto);
        return new ResponseEntity<>(createdAppointment, HttpStatus.CREATED);
    }

    @GetMapping("get/{appointmentId}")
    public ResponseEntity<AppointmentDto2> getAppointmentById(@PathVariable Long appointmentId) {
    	AppointmentDto2 getAppointment = appointmentService.getAppointmentById(appointmentId);
        return new ResponseEntity<>(getAppointment, HttpStatus.CREATED);
     }

    @GetMapping("/getAll")
    public ResponseEntity<List<AppointmentDto2>> getAllAppointments() {
        List<AppointmentDto2> appointments = appointmentService.getAllAppointments();
        return new ResponseEntity<>(appointments, HttpStatus.OK);
    }

    @PutMapping("update/{appointmentId}")
    public ResponseEntity<String> updateAppointment(@PathVariable Long appointmentId, @RequestBody AppointmentDateTimeStausUpdateDto appointmentDateTimeStausUpdateDto) {
    	String updateAppointment = appointmentService.updateAppointment(appointmentId, appointmentDateTimeStausUpdateDto);
        
            return new ResponseEntity<>(updateAppointment, HttpStatus.OK);
        
    }

    @DeleteMapping("delete/{appointmentId}")
    public ResponseEntity<String> deleteByAppointmentId(@PathVariable Long appointmentId) {
        String deleteAppointment = appointmentService.deleteByAppointmentId(appointmentId);
        return new ResponseEntity<>(deleteAppointment, HttpStatus.OK);
        
    }
}
