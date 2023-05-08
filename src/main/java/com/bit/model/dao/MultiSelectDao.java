package com.bit.model.dao;

import java.util.Hashtable;
import java.util.List;

public interface MultiSelectDao {

	public List<Object>selectEmp(Hashtable<String, Object> map);
}
