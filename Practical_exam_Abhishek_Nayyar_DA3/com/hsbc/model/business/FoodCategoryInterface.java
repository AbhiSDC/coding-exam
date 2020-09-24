package com.hsbc.model.business;

import java.util.List;

import com.hsbc.exception.CategoryNotFoundException;
import com.hsbc.exception.DuplicateEntryException;
import com.hsbc.model.beans.FoodItems;

// UserService will access methods present in UserDAO
public interface FoodCategoryInterface {
	public void store(FoodItems fi) throws DuplicateEntryException;
	public List<FoodItems> getItems() throws CategoryNotFoundException;
}
