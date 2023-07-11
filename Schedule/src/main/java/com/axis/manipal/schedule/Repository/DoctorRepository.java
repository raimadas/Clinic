package com.axis.manipal.schedule.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.manipal.schedule.Entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository <Doctor, Long> {

}
