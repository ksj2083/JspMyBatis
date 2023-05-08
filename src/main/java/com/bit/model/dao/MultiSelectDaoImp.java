package com.bit.model.dao;

import com.bit.conf.SqlSessionManager;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.Hashtable;
import java.util.List;

public class MultiSelectDaoImp implements MultiSelectDao{

	private static MultiSelectDao multiSelectDao=new MultiSelectDaoImp();
	private SqlSessionFactory sessionFactory=SqlSessionManager.getSqlSessionFactory();
	
	public static MultiSelectDao getMultiSelectDao() {
		return multiSelectDao;
	}
	@Override
	public List<Object> selectEmp(Hashtable<String, Object> map) {
		// TODO Auto-generated method stub
		SqlSession sqlSession=sessionFactory.openSession();
		List<Object>list=null;
		try {
			list=sqlSession.selectList("com.bit.vo.selectEmp",map);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}

		return list;
	}
	

}
