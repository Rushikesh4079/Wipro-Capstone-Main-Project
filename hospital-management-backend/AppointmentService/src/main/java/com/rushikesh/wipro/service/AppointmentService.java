package com.rushikesh.wipro.service;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import com.rushikesh.wipro.entity.Appointment;

import jakarta.validation.Valid;

public interface AppointmentService {

	Appointment save(@Valid Appointment appointment);

	Page<Appointment> getAllAppointments(int page, int size);

	Appointment getAppointmentById(Integer appointmentId);

	Appointment updateAppointmentById(Integer appointmentId, Appointment appointment);

	ResponseEntity<?> deleteAppointmentById(Integer appointmentId);

}