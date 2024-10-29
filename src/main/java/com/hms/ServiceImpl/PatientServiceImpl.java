package com.hms.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.Entities.PatientEntity;
import com.hms.Repository.PatientRepository;
import com.hms.Service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public PatientEntity savePatient(PatientEntity patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<PatientEntity> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public PatientEntity getPatientById(long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient details are not found"));
    }

    @Override
    public PatientEntity updatePatient(PatientEntity patient, long id) {
        PatientEntity existingPatient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));

        existingPatient.setPatid(patient.getPatid());
        existingPatient.setDov(patient.getDov());
        existingPatient.setPrescription(patient.getPrescription());
        
        patientRepository.save(existingPatient);
        return existingPatient;
    }

    @Override
    public void deletePatient(long id) {
        patientRepository.deleteById(id);
    }
}
