package com.infy.autoScan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.autoScan.dao.DesktopAllocationDAO;
import com.infy.autoScan.dao.DesktopAllocationDAOImpl;
import com.infy.autoScan.model.Trainee;
import com.infy.autoScan.validator.Validator;

@Service(value = "desktopAllocationService")
public class DesktopAllocationServiceImpl implements DesktopAllocationService
{
	
	@Autowired
	private DesktopAllocationDAO desktopDAO;
	
	public Integer addNewTrainee(Trainee trainee) throws Exception {
		Validator validator = new Validator();
		validator.validate(trainee);
		Integer value = desktopDAO.addNewTrainee(trainee);
		return 1;
	}
	
	public Trainee getAllocationDetails(Integer traineeId) {
		return null;
	}
}
