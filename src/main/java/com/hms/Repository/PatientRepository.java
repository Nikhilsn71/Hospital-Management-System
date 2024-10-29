package com.hms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.Entities.PatientEntity;

public interface PatientRepository extends JpaRepository<PatientEntity, Long>{

}
