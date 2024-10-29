package com.hms.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient")
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("patid")
    private long patid;
    
    @Column(name = "Patient_name")
    @JsonProperty("patName")
    private String patName;
    
    @Column(name = "dov")
    @JsonProperty("dov")
    private Date dov;
    
    @Column(name = "age")
    @JsonProperty("age")
    private String age;
    
    @Column(name = "prescription")
    @JsonProperty("prescription")
    private String prescription;
    
    @ManyToOne
    @JoinColumn(name = "docid", referencedColumnName = "doc_id")
    @JsonIgnoreProperties("patients") 
    private DoctorEntity doctor;
    
    public void setPatid(long patid) {
        this.patid = patid;
    }
    
    public void setDoctor(DoctorEntity doctor) {
        this.doctor = doctor;
    }
}
