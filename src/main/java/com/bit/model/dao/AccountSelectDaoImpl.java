package com.bit.model.dao;

import com.bit.conf.SqlSessionManager;
import com.bit.vo.BitMemberVO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.Hashtable;

public class AccountSelectDaoImpl implements AccountSelectDao{

    private static AccountSelectDao accountSelectDao = new AccountSelectDaoImpl();
    private SqlSessionFactory sessionFactory= SqlSessionManager.getSqlSessionFactory();

    public static AccountSelectDao getAccountSelectDao() {
        return accountSelectDao;
    }

    @Override
    public BitMemberVO selectAccount(Hashtable<String, Object> map) {
        // TODO Auto-generated method stub
        SqlSession sqlSession=sessionFactory.openSession();

        BitMemberVO vo = null;

        try {
            vo = sqlSession.selectOne("com.bit.vo.selectBitMemberByUserIdAndUserPw", map);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }

        System.out.println("pw: " + vo.getUserpw());

        return vo;
    }
}
