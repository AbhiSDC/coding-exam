package com.hsbc.model.dao;

import java.util.List;

import com.hsbc.exception.CategoryNotFoundException;
import com.hsbc.exception.DuplicateEntryException;
import com.hsbc.model.beans.Apparel;

public interface ApparelDaoInterface {
	public Apparel store(Apparel fi);
	public List<Apparel> getItems();
}
