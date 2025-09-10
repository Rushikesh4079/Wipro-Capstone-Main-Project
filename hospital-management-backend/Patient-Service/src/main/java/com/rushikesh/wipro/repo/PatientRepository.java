package com.rushikesh.wipro.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rushikesh.wipro.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}