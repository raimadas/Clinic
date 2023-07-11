package com.axis.manipal.reminder.Exception;

public class ReminderNotFoundException extends RuntimeException {
    public ReminderNotFoundException(Long reminderId) {
        super("Reminder not found with ID: " + reminderId);
    }
}
