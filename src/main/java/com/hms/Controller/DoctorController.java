package com.hms.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hms.Entities.DoctorEntity;
import com.hms.Service.DoctorService;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/api/adddoctor")
    public ResponseEntity<DoctorEntity> saveDoctor(@RequestBody DoctorEntity doctor) {
        return new ResponseEntity<>(doctorService.saveDoctor(doctor), HttpStatus.CREATED);
    }

    @PostMapping("/api/assignment/{docId}/{patId}")
    public ResponseEntity<String> assignPatientToDoctor(
            @PathVariable("docId") long docId,
            @PathVariable("patId") long patId) {
        return new ResponseEntity<>(doctorService.assignPatientToDoctor(docId, patId), HttpStatus.CREATED);
    }

    @GetMapping("/api/getAllDoctors")
    public ResponseEntity<List<DoctorEntity>> getAllDoctors() {
        List<DoctorEntity> doctors = doctorService.getAllDoctors();
        return new ResponseEntity<>(doctors, HttpStatus.OK);
    }
}
