package com.hsbc.model.dao;

import java.util.List;

import com.hsbc.exception.CategoryNotFoundException;
import com.hsbc.exception.DuplicateEntryException;
import com.hsbc.model.beans.FoodItems;

// UserService will access methods present in UserDAO
public interface FoodDaoInterface {
	public FoodItems store(FoodItems fi);
	public List<FoodItems> getItems();
}
