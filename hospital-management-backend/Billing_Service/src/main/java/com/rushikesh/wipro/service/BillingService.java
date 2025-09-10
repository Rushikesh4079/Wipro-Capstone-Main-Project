package com.rushikesh.wipro.service;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import com.rushikesh.wipro.entity.Billing;

import jakarta.validation.Valid;

public interface BillingService {

	Billing save(@Valid Billing billing);

	Page<Billing> getAllBillings(int page, int size);

	Billing getBillingById(Integer billingId);

	Billing updateBillingById(Integer billingId, Billing billing);

	ResponseEntity<?> deleteBillingById(Integer billingId);

}