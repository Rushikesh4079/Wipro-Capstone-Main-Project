package com.rushikesh.wipro.entity;

import java.time.LocalDate;
import java.util.List;

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
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer patientId;
	
	@NotBlank(message="Patient Name is mandatory")
	@Column(name="patient_name")
	private String patientName;
	
	@NotBlank(message="Patient Address is mandatory")
	@Column(name="patient_address")
	private String patientAddress;
	
	@Column(name="dob")
	@NotNull(message="Patient DOB is mandatory")
	private LocalDate dateOfBirth;
	
	@Column(name="weight")
	private Integer weight;
	
	@Column(name="height")
	private Integer height;
	
	@Column(name="medical_records")
	private List<Integer> medicalRecords;

}
