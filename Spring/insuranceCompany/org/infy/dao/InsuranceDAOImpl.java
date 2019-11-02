package org.infy.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.infy.model.Policy;
import org.infy.service.InsuranceDAO;

public class InsuranceDAOImpl implements InsuranceDAO{
	public String buyPolicy(Policy policy) {
		return policy.getPolicyNumber();
	}
	public List<Policy> getAllPolicyDetails(){
		
		Policy policy1 = new Policy();
		policy1.setPolicyNumber("WL-553912");
		policy1.setPolicyHolderName("Jack");
		policy1.setDateOfBirth(LocalDate.of(1992, 01, 10));
		policy1.setPolicyName("Retirement");
		policy1.setPolicyType("Whole Life Policy");
		policy1.setPremium(3500.0);
		policy1.setTenureInMonths(180);
		
		Policy policy2 = new Policy();
		policy2.setPolicyNumber("WL-553913");
		policy2.setPolicyHolderName("Reacher");
		policy2.setDateOfBirth(LocalDate.of(1993, 01, 10));
		policy2.setPolicyName("Retirement");
		policy2.setPolicyType("Endowment Plans");
		policy2.setPremium(3500.0);
		policy2.setTenureInMonths(180);
		
		Policy policy3 = new Policy();
		policy3.setPolicyNumber("TL-553914");
		policy3.setPolicyHolderName("Maria");
		policy3.setDateOfBirth(LocalDate.of(1994, 01, 10));
		policy3.setPolicyName("Retirement");
		policy3.setPolicyType("Term Life Insurance");
		policy3.setPremium(3500.0);
		policy3.setTenureInMonths(180);
		
		Policy policy4 = new Policy();
		policy4.setPolicyNumber("TL-553915");
		policy4.setPolicyHolderName("Raghu N");
		policy4.setDateOfBirth(LocalDate.of(1995, 01, 10));
		policy4.setPolicyName("Retirement");
		policy4.setPolicyType("Term Life Insurance");
		policy4.setPremium(3500.0);
		policy4.setTenureInMonths(180);
		
		Policy policy5 = new Policy();
		policy5.setPolicyNumber("TL-553916");
		policy5.setPolicyHolderName("John M");
		policy5.setDateOfBirth(LocalDate.of(1996, 01, 10));
		policy5.setPolicyName("Retirement");
		policy5.setPolicyType("Term Life Insurance");
		policy5.setPremium(3500.0);
		policy5.setTenureInMonths(180);
	
		
		
		List<Policy> policylist = new ArrayList<>();
		policylist.add(policy1);
		policylist.add(policy2);
		policylist.add(policy3);
		policylist.add(policy4);
		policylist.add(policy5);
		

		return policylist;
		
	}
}
