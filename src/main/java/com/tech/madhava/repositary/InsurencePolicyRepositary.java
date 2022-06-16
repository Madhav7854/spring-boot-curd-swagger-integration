package com.tech.madhava.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.madhava.entity.InsurencePolicy;

public interface InsurencePolicyRepositary extends JpaRepository<InsurencePolicy, Integer> {
	
	InsurencePolicy findByPolicyName(String insurencePolicyName);
}
