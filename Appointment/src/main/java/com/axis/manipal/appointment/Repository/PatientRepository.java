package com.axis.manipal.appointment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.manipal.appointment.Entity.Patient;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
   
}