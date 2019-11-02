package org.infy.validator;

import java.time.LocalDate;
import org.infy.model.Policy;

public class Validator {
	public static void validate(Policy policy) throws Exception {
		validatepolicyNumber(policy.getPolicyNumber(), policy.getPolicyType());
		validatePolicyName(policy.getPolicyName());
		validatePolicyType(policy.getPolicyType());
		validatePremium(policy.getPremium());
		validateTenure(policy.getTenureInMonths());
		validateDateOfBirth(policy.getDateOfBirth());
		validatePolicyHolderName(policy.getPolicyHolderName());
	
	}
	
	public static Boolean validatePolicyName(String policyName) throws Exception {
		if(policyName.matches("[a-zA-Z]+")) {
			return true;
		}else {
			throw new Exception("validator.INVALID_POLICY_NAME");
		}
	}
	
	public static Boolean validatePolicyType(String policyType) throws Exception {
		if(policyType.equals("Term Life Insurance")) {
			return true;
		}else if(policyType.equals("Whole Life Policy")) {
			return true;
		}else if(policyType.equals("Endowment Plans")) {
			return true;
		}else {
			throw new Exception("validator.INVALID_POLICY_TYPE");
		}
		
	}
	
	public static Boolean validatePremium(double premium) throws Exception {
		if(premium>100) {
			return true;
		}else throw new Exception("validator.INVALID_PREMIUM");
	}
	
	public static Boolean validateTenure(Integer tenureInMonths) throws Exception {
		if(tenureInMonths>24) {
			return true;
		}else throw new Exception("validator.INVALID_TENURE");
	}
	
	public static Boolean validateDateOfBirth(LocalDate dateOfBirth) throws Exception {
		LocalDate today = LocalDate.now();
		if(dateOfBirth.isBefore(today)) {
			return true;
		}else throw new Exception("validator.INVALID_DOB");
	}
	
	public static Boolean validatepolicyNumber(String policyNumber,String policyType) throws Exception {
		if(policyType.equals("Term Life Insurance") && policyNumber.matches("TL-[//d]{6}")) {
			return true;
		}else if(policyType.equals("Whole Life Policy") && policyNumber.matches("WL-[//d]{6}")) {
			return true;
		}else if(policyType.equals("Endowment Plans") && policyNumber.matches("EP-[//d]{6}")) {
			return true;
		}else {
			throw new Exception("validator.INVALID_POLICY_NUMBER");
		}
	}
	
	public static Boolean validatePolicyHolderName(String policyholderName) throws Exception {
		if(policyholderName.matches("([//w]{3,}\\s?)+")) {
			return true;
		}else {
			throw new Exception("validator.INVALID_POLICY_HOLDER_NAME");
		}
	}
}
