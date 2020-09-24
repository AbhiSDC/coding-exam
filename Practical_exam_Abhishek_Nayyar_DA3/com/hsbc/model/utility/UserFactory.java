package com.hsbc.model.utility;

import com.hsbc.model.business.ApparelService;
import com.hsbc.model.business.ElectronicsService;
import com.hsbc.model.business.FoodItemService;
import com.hsbc.model.dao.ApparelDao;
import com.hsbc.model.dao.ElectronicsDao;
import com.hsbc.model.dao.FoodDao;


public class UserFactory {
	// it can return dao, service or controller instance
	
	
	public static Object getInstance(Type type) {
		Object obj = null;
		switch(type) {
		case FOODDAO : 
			obj = new FoodDao();
			break;
		case APPARELDAO :
			obj = new ApparelDao();
			break;
		case ELECDAO :
			obj = new ElectronicsDao();
			break;
		case FOODSERVICE :
			obj = new FoodItemService();
			break;
		case APPARELSERVICE :
			obj = new ApparelService();
			break;
		case ELECSERVICE :
			obj = new ElectronicsService();
			break;
			
		}
		return obj;
	}
}
