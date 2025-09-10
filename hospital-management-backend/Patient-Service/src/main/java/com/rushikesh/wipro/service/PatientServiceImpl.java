package com.rushikesh.wipro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rushikesh.wipro.entity.Patient;
import com.rushikesh.wipro.repo.PatientRepository;

import jakarta.validation.Valid;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public Patient save(@Valid Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

	@Override
	public Page<Patient> getAllPatients(int page, int size) {
		// TODO Auto-generated method stub
		return patientRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public Patient getPatientById(Integer patientId) {
		// TODO Auto-generated method stub
		return patientRepository.findById(patientId).orElseThrow(()-> new RuntimeException("Patient ID with "+patientId+" not found"));
	}

	@Override
	public Patient updatePatientById(Integer patientId, Patient patient) {
		// TODO Auto-generated method stub
		Patient updated=patientRepository.findById(patientId).orElseThrow(()->new RuntimeException("Patient ID with "+patientId+" not found"));
		updated.setPatientName(patient.getPatientName());
		updated.setPatientAddress(patient.getPatientAddress());
		updated.setDateOfBirth(patient.getDateOfBirth());
		updated.setWeight(patient.getWeight());
		updated.setHeight(patient.getHeight());
		updated.setMedicalRecords(patient.getMedicalRecords());
		return patientRepository.save(updated);
	}

	@Override
	public ResponseEntity<?> deletePatientById(Integer patientId) {
		// TODO Auto-generated method stub
		patientRepository.deleteById(patientId);
		return ResponseEntity.ok("Patient ID with "+patientId+" deleted successfully");
	}

}