package org.infy.model;

public class PolicyReport {
	private String policyNumber;
	private String policyHolderName;
	private double policyHolderAge;
	private Integer tenureInMonths;
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public double getPolicyHolderAge() {
		return policyHolderAge;
	}
	public void setPolicyHolderAge(double policyHolderAge) {
		this.policyHolderAge = policyHolderAge;
	}
	public Integer getTenureInMonths() {
		return tenureInMonths;
	}
	public void setTenureInMonths(Integer tenureInMonths) {
		this.tenureInMonths = tenureInMonths;
	}
	
}
