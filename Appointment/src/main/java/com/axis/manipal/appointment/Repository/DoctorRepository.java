package com.axis.manipal.appointment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.manipal.appointment.Entity.Doctor;



@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
	 
}