<%@ page import="org.apache.ibatis.session.SqlSessionFactory" %>
<%@ page import="com.bit.conf.SqlSessionManager" %>
<%@ page import="org.apache.ibatis.session.SqlSession" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    SqlSessionFactory sessionFactory = SqlSessionManager.getSqlSessionFactory();
    SqlSession sqlSession = sessionFactory.openSession();
    //out.println(sqlSession);
%>

조회결과
<%=sqlSession.selectList("com.bit.vo.selectTest") %>
</body>
</html>
