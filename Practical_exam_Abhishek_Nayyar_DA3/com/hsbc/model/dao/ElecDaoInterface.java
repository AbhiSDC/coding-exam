package com.hsbc.model.dao;

import java.util.List;

import com.hsbc.exception.CategoryNotFoundException;
import com.hsbc.exception.DuplicateEntryException;
import com.hsbc.model.beans.Electronics;

public interface ElecDaoInterface {
	public Electronics store(Electronics ei);
	public List<Electronics> getItems();
}
