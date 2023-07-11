package com.axis.manipal.Controller;

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

import com.axis.manipal.Dto.QueueDto;
import com.axis.manipal.Dto.QueueEntryDto;
import com.axis.manipal.Dto.UpdateQueueDto;
import com.axis.manipal.Service.QueueService;

@RestController
@RequestMapping("/queue")
public class QueueController {
	
	@Autowired
	QueueService queueService;
	
	@PostMapping("/add")
	public ResponseEntity<String> createQueue(@RequestBody QueueEntryDto queue){
		String createdQueue=queueService.createQueue(queue);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdQueue);
	}
	
	@GetMapping("/get/{queueId}")
	public ResponseEntity<QueueDto> getQueueById(@PathVariable Long queueId){
		QueueDto queue=queueService.getQueueById(queueId);
		return new ResponseEntity<>(queue, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<QueueDto>> getAllQueues(){
		List<QueueDto> queues=queueService.getAllQueues();
		return new ResponseEntity<>(queues, HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{queueId}")
	public ResponseEntity<String> updateQueue(@PathVariable Long queueId, UpdateQueueDto queueDto){
		String str=queueService.updateQueue(queueId, queueDto);
		return new ResponseEntity<>(str, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{queueId}")
	public ResponseEntity<String> deleteQueue(@PathVariable Long queueId){
		String str=queueService.deleteQueue(queueId);
		return new ResponseEntity<>(str, HttpStatus.CREATED);
	}

}
