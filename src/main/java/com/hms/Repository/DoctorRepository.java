package com.hms.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hms.Entities.DoctorEntity;
import com.hms.Entities.PatientEntity;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {
    @Query("select d from DoctorEntity d where d.docName = ?1")
    DoctorEntity findByDocName(String dname);
    
    @Query("SELECT p FROM PatientEntity p JOIN p.doctor d WHERE d.docId = :docId")
    List<PatientEntity> findPatientsByDoctorId(@Param("docId") Long docId);
}
