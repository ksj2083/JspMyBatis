<%@page import="org.apache.ibatis.session.SqlSession"%>
<%@page import="com.bit.conf.SqlSessionManager"%>
<%@page import="org.apache.ibatis.session.SqlSessionFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   SqlSessionFactory sessionFactory=SqlSessionManager.getSqlSessionFactory();
   SqlSession sqlSession=sessionFactory.openSession(); 
   

%>
  EMP<%=sqlSession.selectList("com.bit.vo.EMP") %>
</body>
</html>