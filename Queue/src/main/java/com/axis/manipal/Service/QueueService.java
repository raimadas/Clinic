package com.axis.manipal.Service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.manipal.Dto.AppointmentDto;
import com.axis.manipal.Dto.QueueDto;
import com.axis.manipal.Dto.QueueEntryDto;
import com.axis.manipal.Dto.UpdateQueueDto;
import com.axis.manipal.Entity.Appointment;
import com.axis.manipal.Entity.Queue;
import com.axis.manipal.Repository.AppointmentRepository;
import com.axis.manipal.Repository.QueueRepository;



@Service
public class QueueService {
	
	@Autowired
	QueueRepository queueRepository;
	
	@Autowired
	AppointmentRepository ar;
	
	
	public String createQueue(QueueEntryDto queue) {
		//logic to create queue
		Appointment ad = ar.findById(queue.getAppointmentId()).get();
		Queue rd=new Queue();
		rd.setQueueNumber(queue.getQueueNumber());
		rd.setQueueStatus(queue.getQueueStatus());
		rd.setAppointment(ad);
		queueRepository.save(rd);
		
		return "Queue added successfully";
		
	}
	
	
	public QueueDto getQueueById(Long queueId) {
		Queue rd= queueRepository.findById(queueId).get();
		
		Appointment ap=ar.findById(rd.getAppointment().getAppointmentId()).get();
		
		QueueDto rdt=new QueueDto();
		
		//appointment Dto set
		AppointmentDto ad=new AppointmentDto();
		ad.setAppointmentDate(ap.getAppointmentDate());
		ad.setAppointmentTime(ap.getAppointmentTime());
		ad.setAppointmentId(ap.getAppointmentId());
		ad.setStatus(ap.getStatus());
		
		//queue dto set
		rdt.setQueueId(rd.getQueueId());
		rdt.setQueueNumber(rd.getQueueNumber());
		rdt.setQueueStatus(rd.getQueueStatus());
		rdt.setApList(ad);
		
		return rdt;
	}
	
	public List<QueueDto> getAllQueues(){
		
		List<Queue> rd=queueRepository.findAll();
		List<QueueDto> rdt=new ArrayList<>();
		
		for(Queue rd1:rd) {
			Appointment ap=ar.findById(rd1.getAppointment().getAppointmentId()).get();
			
			AppointmentDto apdt=new AppointmentDto();
			apdt.setAppointmentDate(ap.getAppointmentDate());
			apdt.setAppointmentId(ap.getAppointmentId());
			apdt.setAppointmentTime(ap.getAppointmentTime());
			apdt.setStatus(ap.getStatus());
			
			QueueDto rd2 =new QueueDto();
			rd2.setQueueId(rd1.getQueueId());
			rd2.setQueueNumber(rd1.getQueueNumber());
			rd2.setQueueStatus(rd1.getQueueStatus());
			rd2.setApList(apdt);
			
			rdt.add(rd2);
		}
		
		return rdt;
	}
	
	public String updateQueue(Long queueId, UpdateQueueDto queue) {
		try {
			Queue rd=queueRepository.findById(queueId).get();
			
			rd.setQueueNumber(queue.getQueueNumber());
			rd.setQueueStatus(queue.getQueueStatus());
			
			queueRepository.save(rd);
		}catch(Exception e) {
			return "Queue not found";
		}
		
		return "Queue is updated successfully";
		
	}
	
	public String deleteQueue(Long queueId) {
		try {
			queueRepository.deleteById(queueId);
		}catch(Exception e) {
			return "Queue not found";
		}
		return "Queue Deleted successfully";
	}

}
