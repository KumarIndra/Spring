	package com.infy.exercise.validator;

import com.infy.exercise.model.TeamMember;

public class Validator {
	public static void validate(TeamMember teamMember) throws Exception {
		
		if(validateEmployeeId(teamMember.getEmployeeId())) {	
		}else {
			throw new Exception("INVALID_EMPLOYEEID");
		}
	}
	
	public static boolean validateEmployeeId(Integer employeeId) {
		if(employeeId>99999 && employeeId<=999999) {
			return true;
		}else {
			return false;
		}
		
	}
}
