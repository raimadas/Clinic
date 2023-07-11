package com.axis.manipal.Doctor.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.manipal.Doctor.Entity.Doctor;



@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
	 
}

