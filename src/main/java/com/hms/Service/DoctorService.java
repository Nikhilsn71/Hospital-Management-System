package com.hms.Service;

import java.util.List;

import com.hms.Entities.DoctorEntity;
import com.hms.Entities.PatientEntity;

public interface DoctorService {
    DoctorEntity saveDoctor(DoctorEntity doctor);  
    String assignPatientToDoctor(long docId, long patId);  
    List<PatientEntity> getPatientsByDoctorId(Long docId); 
    List<DoctorEntity> getAllDoctors();  // New method to get all doctors
}
