package com.infy.autoScan.service;

import com.infy.autoScan.model.Trainee;

public interface DesktopAllocationService {
	public Integer addNewTrainee(Trainee trainee) throws Exception;
	public Trainee getAllocationDetails(Integer traineeId);
}
