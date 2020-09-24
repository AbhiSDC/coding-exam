package com.hsbc.model.business;

import java.util.List;

import com.hsbc.exception.CategoryNotFoundException;
import com.hsbc.exception.DuplicateEntryException;
import com.hsbc.model.beans.Electronics;

public class ElectronicsService implements ElecCategoryInterface {

	@Override
	public void store(Electronics ei) throws DuplicateEntryException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Electronics> getItems() throws CategoryNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}



}
