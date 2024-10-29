package com.hms.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.Entities.DoctorEntity;
import com.hms.Entities.PatientEntity;
import com.hms.Repository.DoctorRepository;
import com.hms.Repository.PatientRepository;
import com.hms.Service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;
    
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public DoctorEntity saveDoctor(DoctorEntity doctor) {
        return doctorRepository.save(doctor);
    }
    
    @Override
    public String assignPatientToDoctor(long docId, long patId) {
        PatientEntity patient = patientRepository.findById(patId)
                .orElseThrow(() -> new RuntimeException("Patient details not found"));
        DoctorEntity doctor = doctorRepository.findById(docId)
                .orElseThrow(() -> new RuntimeException("Doctor details not found"));
        
        patient.setDoctor(doctor);
        patientRepository.save(patient);

        return "Assignment has been done successfully";
    }

    @Override
    public List<PatientEntity> getPatientsByDoctorId(Long docId) {
        return doctorRepository.findPatientsByDoctorId(docId);
    }

    @Override
    public List<DoctorEntity> getAllDoctors() {
        return doctorRepository.findAll();
    }
}
