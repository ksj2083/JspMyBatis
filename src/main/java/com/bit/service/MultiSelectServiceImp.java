package com.bit.service;

import java.util.Hashtable;
import java.util.List;

import com.bit.model.dao.MultiSelectDaoImp;

public class MultiSelectServiceImp implements MultiSelectService{

	private static MultiSelectService multiSelectService=new MultiSelectServiceImp();
	@Override
	public List<Object> selectEmp(Hashtable<String, Object> map) {
		// TODO Auto-generated method stub
		return MultiSelectDaoImp.getMultiSelectDao().selectEmp(map);
	}
	
	public static MultiSelectService getMultiSelectService() {
		return multiSelectService;
	}
}
