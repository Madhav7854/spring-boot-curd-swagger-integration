package com.tech.madhava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.madhava.entity.InsurencePolicy;
import com.tech.madhava.repositary.InsurencePolicyRepositary;

@Service
public class InsurencePolicyService {

	@Autowired
	private InsurencePolicyRepositary insurencePolicyRepositary;

	public InsurencePolicy saveInsurencePolicy(InsurencePolicy insurencePolicy) {
		return insurencePolicyRepositary.save(insurencePolicy);
	}

	public List<InsurencePolicy> saveInsurencePolicies(List<InsurencePolicy> policies) {
		return insurencePolicyRepositary.saveAll(policies);
	}

	public List<InsurencePolicy> getAllPolicies() {
		return insurencePolicyRepositary.findAll();
	}

	public InsurencePolicy getInsurencePolicyById(int policyId) {
		return insurencePolicyRepositary.findById(policyId).orElse(null);
	}

	public InsurencePolicy getInsurencePolicyByName(String insurencePolicyName) {
		return insurencePolicyRepositary.findByPolicyName(insurencePolicyName);
	}

	public InsurencePolicy updatePolicy(InsurencePolicy insurencePolicy) {
		InsurencePolicy exisitingPolicy = insurencePolicyRepositary.findById(insurencePolicy.getPolicyId()).orElse(null);
		exisitingPolicy.setAgentId(insurencePolicy.getAgentId());
		exisitingPolicy.setPolicyName(insurencePolicy.getPolicyName());
		exisitingPolicy.setPolicyStarted(insurencePolicy.getPolicyStarted());
		exisitingPolicy.setTenure(insurencePolicy.getTenure());
		return insurencePolicyRepositary.save(exisitingPolicy);
	}

	public String DeleteInsurencePolicy(int id) {
		insurencePolicyRepositary.deleteById(id);
		return "insurence policy deleted from db .." + id;
	}

}
