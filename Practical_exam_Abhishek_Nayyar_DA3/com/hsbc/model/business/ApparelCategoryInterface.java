package com.hsbc.model.business;

import java.util.List;

import com.hsbc.exception.CategoryNotFoundException;
import com.hsbc.exception.DuplicateEntryException;
import com.hsbc.model.beans.Apparel;

public interface ApparelCategoryInterface {
	public void store(Apparel fi) throws DuplicateEntryException;
	public List<Apparel> getItems() throws CategoryNotFoundException;
}
