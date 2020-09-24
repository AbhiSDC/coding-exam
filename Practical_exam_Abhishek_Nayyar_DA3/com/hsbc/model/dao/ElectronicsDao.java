package com.hsbc.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;

public class ElectronicsDao implements ElecDaoInterface{
	List<Electronics> elecList = new ArrayList<Electronics>();
	
	@Override
	public Electronics store(Electronics ei) {
		// TODO Auto-generated method stub
		for(Electronics e : elecList) {
			if(e.getItemCode() == ei.getItemCode()) {
				return null;
			}
		}
		elecList.add(ei);
		return ei;
	}

	@Override
	public List<Electronics> getItems() {
		// TODO Auto-generated method stub
		return null;
	}

}
