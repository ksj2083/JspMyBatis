package com.bit.service;

import com.bit.model.dao.AccountSelectDaoImpl;
import com.bit.model.dao.MultiSelectDaoImp;
import com.bit.vo.BitMemberVO;
import com.bit.vo.EmployeesVO;

import java.util.Hashtable;
import java.util.List;

public class AccountSelectServiceImpl implements AccountSelectService{

	public static AccountSelectService accountSelectService = new AccountSelectServiceImpl();

	public static AccountSelectService getAccountSelectService() {


		return accountSelectService;
	}

	@Override
	public BitMemberVO selectBitMemberByIdAndPw(Hashtable<String, Object> map) {
		return AccountSelectDaoImpl.getAccountSelectDao().selectAccount(map);
	}
}
