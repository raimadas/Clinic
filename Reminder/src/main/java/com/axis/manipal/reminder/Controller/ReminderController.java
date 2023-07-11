package com.axis.manipal.reminder.Controller;

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

import com.axis.manipal.reminder.Dto.ReminderDto;
import com.axis.manipal.reminder.Dto.ReminderEntryDto;
import com.axis.manipal.reminder.Dto.UpdateReminderDto;
import com.axis.manipal.reminder.Entity.Reminder;
import com.axis.manipal.reminder.Service.ReminderService;

@RestController
@RequestMapping("/reminder")
public class ReminderController {
	@Autowired
    ReminderService reminderService;

    

    @PostMapping("/add")
    public ResponseEntity<String> createReminder(@RequestBody ReminderEntryDto reminder) {
        String createdReminder = reminderService.createReminder(reminder);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdReminder);
    }

    @GetMapping("/get/{reminderId}")
    public ResponseEntity<ReminderDto> getReminderById(@PathVariable Long reminderId) {
    	ReminderDto reminder = reminderService.getReminderById(reminderId);
        return new ResponseEntity<>(reminder, HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ReminderDto>> getAllReminders() {
        List<ReminderDto> reminders = reminderService.getAllReminders();
        return new ResponseEntity<>(reminders, HttpStatus.CREATED);
    }

    @PutMapping("/update/{reminderId}")
    public ResponseEntity<String> updateReminder(@PathVariable Long reminderId, @RequestBody UpdateReminderDto reminderDto) {
        String reminder = reminderService.updateReminder(reminderId, reminderDto);
        return new ResponseEntity<>(reminder, HttpStatus.CREATED);

    }

    @DeleteMapping("/delete/{reminderId}")
    public ResponseEntity<String> deleteReminder(@PathVariable Long reminderId) {
        String str = reminderService.deleteReminder(reminderId);
        return new ResponseEntity<>(str, HttpStatus.CREATED);
    }
}
