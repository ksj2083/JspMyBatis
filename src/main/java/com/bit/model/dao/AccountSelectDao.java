package com.bit.model.dao;

import com.bit.vo.BitMemberVO;
import com.bit.vo.EmployeesVO;

import java.util.Hashtable;

public interface AccountSelectDao {

    public BitMemberVO selectAccount(Hashtable<String, Object> map);
}
