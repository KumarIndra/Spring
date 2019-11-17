package com.infy.autoScan.dao;

import com.infy.autoScan.model.Trainee;

public interface DesktopAllocationDAO {
	public Integer addNewTrainee(Trainee trainee);
	public Trainee getAllocationDetails(Integer traineeId);
}
