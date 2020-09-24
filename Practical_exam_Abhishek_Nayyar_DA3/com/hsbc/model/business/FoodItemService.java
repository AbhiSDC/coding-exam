package com.hsbc.model.business;

import java.util.List;

import com.hsbc.exception.CategoryNotFoundException;
import com.hsbc.exception.DuplicateEntryException;
import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.beans.FoodItems;
import com.hsbc.model.dao.CategoryDao;
import com.hsbc.model.dao.FoodDaoInterface;
import com.hsbc.model.utility.Type;
import com.hsbc.model.utility.UserFactory;

public class FoodItemService implements FoodCategoryInterface {

	private FoodDaoInterface dao;
	
	public FoodItemService() {
		super();
		// TODO Auto-generated constructor stub
		dao = (FoodDaoInterface) UserFactory.getInstance(Type.FOODDAO);
	}
	
	@Override
	public void store(FoodItems fi) throws DuplicateEntryException {
		// TODO Auto-generated method stub
		FoodItems temp = dao.store(fi);
		if(temp == null) {
			throw new DuplicateEntryException();
		}
	}

	@Override
	public List<FoodItems> getItems() {
		dao.getItems();
		return null;
	}
}
