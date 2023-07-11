package com.axis.manipal.schedule.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.manipal.schedule.Entity.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

}
