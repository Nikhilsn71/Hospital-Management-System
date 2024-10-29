package com.hms.Service;

import java.util.List;

import com.hms.Entities.PatientEntity;

public interface PatientService {
    PatientEntity savePatient(PatientEntity patient);  // Save a patient
    List<PatientEntity> getAllPatients();  // Retrieve all patients
    PatientEntity getPatientById(long id);  // Get a patient by ID
    PatientEntity updatePatient(PatientEntity patient, long id);  // Update a patient's details
    void deletePatient(long id);  // Delete a patient by ID
}
