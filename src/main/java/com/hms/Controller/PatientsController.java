package com.hms.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hms.Entities.PatientEntity;
import com.hms.Service.PatientService;

import java.util.List;

@RestController
public class PatientsController {
    
    @Autowired
    private PatientService patientService;

    @PostMapping("/api/addpatient")
    public ResponseEntity<PatientEntity> savePatient(@RequestBody PatientEntity patient) {
        return new ResponseEntity<>(patientService.savePatient(patient), HttpStatus.CREATED);
    }

    @GetMapping("/api/getPatientById/{id}")
    public ResponseEntity<PatientEntity> getPatientById(@PathVariable("id") long patientId) {
        return new ResponseEntity<>(patientService.getPatientById(patientId), HttpStatus.OK);
    }

    @GetMapping("/api/getAllPatients")
    public ResponseEntity<List<PatientEntity>> getAllPatients() {
        List<PatientEntity> patients = patientService.getAllPatients();
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }

    @PutMapping("/api/updatePatientById/{id}")
    public ResponseEntity<PatientEntity> updatePatient(@PathVariable("id") long id, @RequestBody PatientEntity patient) {
        return new ResponseEntity<>(patientService.updatePatient(patient, id), HttpStatus.OK);
    }

    @DeleteMapping("/api/deletePatientById/{id}")
    public ResponseEntity<String> deletePatient(@PathVariable("id") long id) {
        patientService.deletePatient(id);
        return new ResponseEntity<>("Patient details deleted successfully", HttpStatus.OK);
    }
}
