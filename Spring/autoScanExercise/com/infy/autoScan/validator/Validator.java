package com.infy.autoScan.validator;

import com.infy.autoScan.model.Trainee;

public class Validator {
	public void validate(Trainee trainee) throws Exception {
		boolean flag = validateTrainee(trainee);
		if(flag == true) {
			System.out.println("Validation success");
		}else {
			throw new Exception("Validator.INVALID_NAMES");
		}
	}
	public boolean validateTrainee(Trainee trainee) {
		if(trainee.getId()>0 && trainee.getName().length()>0) return true;	
		else	return false;
	}
}
