package com.tech.madhava.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Insurence_Policy_Tbl")
public class InsurencePolicy {
	
	
	@Id
	@GeneratedValue
	private int policyId;
	private String policyName;
	private Date policyStarted;
	private double tenure;
	private String AgentId;
	
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public Date getPolicyStarted() {
		return policyStarted;
	}
	public void setPolicyStarted(Date policyStarted) {
		this.policyStarted = policyStarted;
	}
	public double getTenure() {
		return tenure;
	}
	public void setTenure(double tenure) {
		this.tenure = tenure;
	}
	public String getAgentId() {
		return AgentId;
	}
	public void setAgentId(String agentId) {
		AgentId = agentId;
	}
	
	
}
