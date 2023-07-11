package com.axis.manipal.appointment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.manipal.appointment.Dto.AppointmentDateTimeStausUpdateDto;
import com.axis.manipal.appointment.Dto.AppointmentDto;
import com.axis.manipal.appointment.Dto.AppointmentDto2;
import com.axis.manipal.appointment.Entity.Appointment;
import com.axis.manipal.appointment.Entity.Doctor;
import com.axis.manipal.appointment.Entity.Patient;
import com.axis.manipal.appointment.Repository.AppointmentRepository;
import com.axis.manipal.appointment.Repository.DoctorRepository;
import com.axis.manipal.appointment.Repository.PatientRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class AppointmentService {
    

    @Autowired
    AppointmentRepository appointmentRepository;
    
    @Autowired
    DoctorRepository docRepo;
    
    @Autowired
    PatientRepository ptR;
    
   

    public String createAppointment(AppointmentDto appointmentdto) {
    	Long doctorId=appointmentdto.getDoctorId();
    	Long patientId=appointmentdto.getPatientId();
    	Appointment app=new Appointment();
    	
//    	for doctor
    	Doctor doctor;
    	doctor = docRepo.findById(doctorId).get();
    	app.setDoctor(doctor);
    	
    	
//    	for patient
    	Patient pt;
    	pt = ptR.findById(patientId).get();
    	app.setPatient(pt);
    			
//    	app.setAppointmentId(appointmentdto.getAppointmentId());
    	app.setStatus(appointmentdto.getStatus());
    	Date d = new Date();
        
    	app.setAppointmentDate(d);
    	
    	appointmentRepository.save(app);
    	
    	return "appointment created";
    }

  public AppointmentDto2 getAppointmentById(Long appointmentId) {
        Appointment a =  appointmentRepository.findById(appointmentId).get();
        AppointmentDto2 ap = new AppointmentDto2();
        ap.setAppointmentDate(a.getAppointmentDate());
        ap.setAppointmentId(a.getAppointmentId());
        ap.setAppointmentTime(a.getAppointmentTime());
        ap.setDoctorId(a.getDoctor().getDoctorId());
        ap.setPatientId(a.getPatient().getPatientId());
        ap.setStatus(a.getStatus());
        return ap;
    }

    public List<AppointmentDto2> getAllAppointments() {
    	List <Appointment> appointmentList = appointmentRepository.findAll();
    	
    	List<AppointmentDto2> appointmentDtoList = new ArrayList<>();
    	
    	for(Appointment ap : appointmentList) {
    		AppointmentDto2 app2 = new AppointmentDto2();
    		app2.setAppointmentDate(ap.getAppointmentDate());
    		app2.setAppointmentId(ap.getAppointmentId());
    		app2.setAppointmentTime(ap.getAppointmentTime());
    		app2.setStatus(ap.getStatus());
    		app2.setDoctorId(ap.getDoctor().getDoctorId());
    		app2.setPatientId(ap.getPatient().getPatientId());
    		
    		appointmentDtoList.add(app2);
    		
    	}
    	return appointmentDtoList;
    }

    public String deleteByAppointmentId(Long appointmentId) {
    	try {
    		appointmentRepository.deleteById(appointmentId);
    	}catch(Exception e) {
    		return "Appointment not found.";
    	}
    	return "Your appointment was deleted successfully.";
    }

	public String updateAppointment(Long appointmentId,
			AppointmentDateTimeStausUpdateDto ap2) {
		// TODO Auto-generated method stub
		
		Appointment ap = appointmentRepository.findById(appointmentId).get();
		Date d = new Date();
		ap.setAppointmentDate(d);
		ap.setAppointmentTime(d);
		ap.setStatus(ap2.getStatus());

		appointmentRepository.save(ap);

		
		return "Appointment updated succesfully.";
	}
}
