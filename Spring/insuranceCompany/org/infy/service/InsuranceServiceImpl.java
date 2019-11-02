package org.infy.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import org.infy.model.Policy;
import org.infy.model.PolicyReport;
import org.infy.validator.Validator;
import org.springframework.beans.factory.annotation.Autowired;

public class InsuranceServiceImpl {
	@Autowired
	private InsuranceDAO insuranceDAO;
	
	public String buyPolicy(Policy policy) throws Exception{
		String value ="";
		Validator valid = new Validator();
		try {
			valid.validate(policy);
			value = insuranceDAO.buyPolicy(policy);
			return value;
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}
	
	public double calculateAge(LocalDate dateOfBirth) {
		LocalDate today = LocalDate.now();
		Period difference = Period.between(dateOfBirth, today);
		return ((difference.getYears()-1)*12)+difference.getMonths();
	}
	
	public List<PolicyReport> getReport(String policyType) throws Exception{
		List<Policy> record;
		int count=0;
		if(policyType.equals("Term Life Insurance") ||policyType.equals("Whole Life Policy") || policyType.equals("Endowment Plans")) {
		record = insuranceDAO.getAllPolicyDetails();
		List<PolicyReport> policyreport = new ArrayList<>();
		for(Policy p:record) {
			if(p.getPolicyType().equals(policyType)) {
				PolicyReport report = new PolicyReport();
				report.setPolicyHolderName(p.getPolicyHolderName());
				report.setPolicyNumber(p.getPolicyNumber());
				report.setPolicyHolderAge(calculateAge(p.getDateOfBirth()));
				report.setTenureInMonths(p.getTenureInMonths());
				policyreport.add(report);
			}
			else {
				count++;
			}
		}
		if(count==policyreport.size()) {
			throw new Exception("Service.NO_RECORD");
		}else {
			return policyreport;
		}
		}else {
			throw new Exception("No Record exist for this policy Type");
		}
	}
}
