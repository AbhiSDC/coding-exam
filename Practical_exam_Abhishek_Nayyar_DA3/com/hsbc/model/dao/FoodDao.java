package com.hsbc.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.model.beans.FoodItems;

public class FoodDao implements FoodDaoInterface {
	List<FoodItems> foodList = new ArrayList<FoodItems>();
	
	@Override
	public FoodItems store(FoodItems fi) {
		// TODO Auto-generated method stub
		for(FoodItems f : foodList) {
			if(f.getItemCode() == fi.getItemCode()) {
				return null;
			}
		}
		foodList.add(fi);
		return fi;
	}

	@Override
	public List<FoodItems> getItems() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
