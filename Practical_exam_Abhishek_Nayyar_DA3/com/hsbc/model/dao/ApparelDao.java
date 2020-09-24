package com.hsbc.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.FoodItems;

public class ApparelDao implements ApparelDaoInterface {

	List<Apparel> appList = new ArrayList<Apparel>();

	@Override
	public Apparel store(Apparel fi) {
		// TODO Auto-generated method stub
		for(Apparel a : appList) {
			if(a.getItemCode() == fi.getItemCode()) {
				return null;
			}
		}
		appList.add(fi);
		return fi;
	}

	@Override
	public List<Apparel> getItems() {
		// TODO Auto-generated method stub
		return null;
	}

}
