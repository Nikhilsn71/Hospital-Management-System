package com.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hms.model.PatientModel;

@Repository
public interface PatientRepo extends JpaRepository<PatientModel, Long>{

}
