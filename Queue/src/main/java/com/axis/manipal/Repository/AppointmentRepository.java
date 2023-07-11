package com.axis.manipal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.manipal.Entity.Appointment;



@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
