package com.rushikesh.wipro.service;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import com.rushikesh.wipro.entity.Patient;

import jakarta.validation.Valid;

public interface PatientService {

	Patient save(@Valid Patient patient);

	Page<Patient> getAllPatients(int page, int size);


	Patient getPatientById(Integer patientId);

	Patient updatePatientById(Integer patientId, Patient patient);

	ResponseEntity<?> deletePatientById(Integer patientId);

}