package com.rushikesh.wipro.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer appointmentId;
    
    @NotNull(message="Patient ID is required")
    @Column(name="patient_id")
    private Integer patientId;
    
    @Column(name="doctor_id")
    @NotNull(message="Doctor ID is required")
    private Integer doctorId;
    
    @Column(name="appointment_date")
    @NotNull(message="Appointment date is mandatory")
    private LocalDateTime appointmentDate;
    
    @Column(name="status")
    @NotNull(message="Status is mandatory")
    private Status status;
    
    @Column(name="appointment_type")
    @NotNull(message="Appointment Type is required")
    private AppointType appointmentType;
}