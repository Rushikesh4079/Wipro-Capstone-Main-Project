package com.rushikesh.wipro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rushikesh.wipro.entity.Billing;
import com.rushikesh.wipro.repository.BillingRepository;

import jakarta.validation.Valid;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepository billingRepository;

	@Override
	public Billing save(@Valid Billing billing) {
		// TODO Auto-generated method stub
		return billingRepository.save(billing);
	}

	@Override
	public Page<Billing> getAllBillings(int page, int size) {
		// TODO Auto-generated method stub
		return billingRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public Billing getBillingById(Integer billingId) {
		// TODO Auto-generated method stub
		return billingRepository.findById(billingId).orElseThrow(()->new RuntimeException("Billing ID with "+billingId+" not found"));
	}

	@Override
	public Billing updateBillingById(Integer billingId, Billing billing) {
		// TODO Auto-generated method stub
		Billing updated=billingRepository.findById(billingId).orElseThrow(()->new RuntimeException("Billing ID with "+billingId+" not found"));
		updated.setPatientId(billing.getPatientId());
		updated.setAppointmentId(billing.getAppointmentId());
		updated.setBillDate(billing.getBillDate());
		updated.setPaymentStatus(billing.getPaymentStatus());
		updated.setTotalAmount(billing.getTotalAmount());
		return billingRepository.save(updated);
	}

	@Override
	public ResponseEntity<?> deleteBillingById(Integer billingId) {
		// TODO Auto-generated method stub
		billingRepository.deleteById(billingId);
		return ResponseEntity.ok("Billing ID with "+billingId+" deleted succesfully");
	}
}
