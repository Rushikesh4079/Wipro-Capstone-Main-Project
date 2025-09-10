package com.rushikesh.wipro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rushikesh.wipro.entity.Billing;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Integer> {

}
