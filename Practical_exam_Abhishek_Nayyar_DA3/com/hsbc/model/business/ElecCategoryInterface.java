package com.hsbc.model.business;

import java.util.List;

import com.hsbc.exception.CategoryNotFoundException;
import com.hsbc.exception.DuplicateEntryException;
import com.hsbc.model.beans.Electronics;

public interface ElecCategoryInterface {
	public void store(Electronics ei) throws DuplicateEntryException;
	public List<Electronics> getItems() throws CategoryNotFoundException;
}
