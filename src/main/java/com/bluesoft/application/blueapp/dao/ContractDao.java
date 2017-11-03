package com.bluesoft.application.blueapp.dao;

import java.util.List;

import com.bluesoft.application.blueapp.model.Contract;

public interface ContractDao {
	
	public void addContract(Contract contract);
	
	public List<Contract> getAllContracts();	
	
	public void updateContract(Contract contract);
	
	public void deactivateContract(Contract contract);
}
