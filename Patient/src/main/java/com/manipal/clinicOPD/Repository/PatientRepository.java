package com.manipal.clinicOPD.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manipal.clinicOPD.Entity.Patient;



@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
