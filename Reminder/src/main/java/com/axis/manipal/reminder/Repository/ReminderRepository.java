package com.axis.manipal.reminder.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.manipal.reminder.Entity.Reminder;

@Repository
public interface ReminderRepository extends JpaRepository<Reminder, Long> {
    
}

