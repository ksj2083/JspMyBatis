package com.bit.service;

import com.bit.vo.BitMemberVO;
import com.bit.vo.EmployeesVO;

import java.util.Hashtable;
import java.util.List;

public interface AccountSelectService {
	public BitMemberVO selectBitMemberByIdAndPw(Hashtable<String, Object> map);

}
