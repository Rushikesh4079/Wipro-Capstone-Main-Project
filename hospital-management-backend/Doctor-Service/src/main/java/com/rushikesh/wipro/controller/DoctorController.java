package com.rushikesh.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rushikesh.wipro.entity.Doctor;
import com.rushikesh.wipro.service.DoctorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping
	private Doctor createDoctor(@Valid @RequestBody Doctor doctor) {
		return doctorService.save(doctor);
	}
	
	@GetMapping("/allDoctors")
	private Page<Doctor> getAllDoctors(@RequestParam int page , @RequestParam int size){
		return doctorService.getAllDoctors(page,size);
	}
	
	@GetMapping("/getDoctor/{doctorId}")
	private Doctor getDoctorById(@PathVariable Integer doctorId) {
		return doctorService.getDoctorById(doctorId);
	}
	
	@PatchMapping("/update/{doctorId}")
	private Doctor updateDoctorById(@PathVariable Integer doctorId, @Valid @RequestBody Doctor doctor) {
		return doctorService.updateDoctorById(doctorId,doctor);
	}
	
	@DeleteMapping("/delete/{doctorId}")
	private ResponseEntity<?> deleteDoctorById(@PathVariable Integer doctorId){
		return doctorService.deleteDoctorById(doctorId);
	}
}
