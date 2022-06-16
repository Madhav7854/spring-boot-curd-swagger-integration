package com.tech.madhava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tech.madhava.entity.InsurencePolicy;
import com.tech.madhava.service.InsurencePolicyService;

@RestController
public class InsurenceController {

	@Autowired
	private InsurencePolicyService insurencePolicyService;

	@PostMapping("/insurence/addPolicy")
	public InsurencePolicy addInsurencePolicy(@RequestBody InsurencePolicy insurencePolicy) {
		return insurencePolicyService.saveInsurencePolicy(insurencePolicy);
	}

	@PostMapping("/insurence/addPolicies")
	public List<InsurencePolicy> addInsurencePolicies(@RequestBody List<InsurencePolicy> insurencePolicies) {
		return insurencePolicyService.saveInsurencePolicies(insurencePolicies);
	}

	@GetMapping("/insurence/findPolicyById/{policyId}")
	public InsurencePolicy getPolicyById(@PathVariable int policyId) {
		return insurencePolicyService.getInsurencePolicyById(policyId);
	}

	@GetMapping("/insurence/findPolicyByName/{policyName}")
	public InsurencePolicy getPolicyByName(@PathVariable String policyName) {
		return insurencePolicyService.getInsurencePolicyByName(policyName);
	}

	@GetMapping("/insurence/policies")
	public List<InsurencePolicy> getAllPolicyDetails() {
		return insurencePolicyService.getAllPolicies();
	}

	@PutMapping("/insurence/updatePolicy")
	public InsurencePolicy updatePolicyDetails(@RequestBody InsurencePolicy insurencePolicy) {
		return insurencePolicyService.updatePolicy(insurencePolicy);
	}

	@DeleteMapping("/insurence/policyDeletById/{policyId}")
	public String RemovePolicyById(@PathVariable int policyId) {
		return insurencePolicyService.DeleteInsurencePolicy(policyId);
	}

}
