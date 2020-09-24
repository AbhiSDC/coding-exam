package com.hsbc.model.business;

import java.util.List;

import com.hsbc.exception.CategoryNotFoundException;
import com.hsbc.exception.DuplicateEntryException;
import com.hsbc.model.beans.Apparel;
import com.hsbc.model.dao.ApparelDaoInterface;
import com.hsbc.model.dao.FoodDaoInterface;
import com.hsbc.model.utility.Type;
import com.hsbc.model.utility.UserFactory;

public class ApparelService implements ApparelCategoryInterface {
	
	private ApparelDaoInterface appdao;
	public ApparelService() {
		super();
		appdao = (ApparelDaoInterface) UserFactory.getInstance(Type.APPARELDAO);
	}

	@Override
	public void storeUser(Apparel fi) throws DuplicateEntryException {
		ApparelDaoInterface temp = appdao.store(fi);
		if(temp == null) {
			throw new DuplicateEntryException();
		}
		
	}

	@Override
	public List<Apparel> getAllUsers() throws CategoryNotFoundException {
		appdao.getItems();
		return null;
	}

}
