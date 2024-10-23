package com.hms.repository;

import org.springframework.stereotype.Repository;

import com.hms.model.DoctorModel;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DoctorRepo extends JpaRepository<DoctorModel,Long>{

}
