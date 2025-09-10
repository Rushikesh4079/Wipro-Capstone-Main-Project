package com.rushikesh.wipro.service;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import com.rushikesh.wipro.entity.Doctor;

import jakarta.validation.Valid;

public interface DoctorService {

	Doctor save(@Valid Doctor doctor);

	Page<Doctor> getAllDoctors(int page, int size);

	Doctor getDoctorById(Integer doctorId);

	Doctor updateDoctorById(Integer doctorId, Doctor doctor);

	ResponseEntity<?> deleteDoctorById(Integer doctorId);

}
