package org.infy.service;

import java.util.List;

import org.infy.model.Policy;

public interface InsuranceDAO {
	String buyPolicy(Policy policy);
	List<Policy> getAllPolicyDetails();
}
