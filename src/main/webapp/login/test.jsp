<%--
  Created by IntelliJ IDEA.
  User: ksj20
  Date: 2023-05-04
  Time: 오후 5:11
  To change this template use File | Settings | File Templates.
--%>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type=text/javascript>

    $(function () {
        $("#btn1").click(function () {
            $.ajax({
                type: 'POST',
                url: "/JspMyBatis_war_exploded/login.do?cmd=login",
                data: {
                    userId: $(".id").val(),
                    userPw: $(".pw").val()
                },
                error: function (request, error) {
                    alert("code:" + request.status + "\n" + "message:" + request.responseText + "\n" + "error:" + error);
                },
                success: function (data) {

                    console.log(data);
                    let {idx, userid, username, userpw, emailid, emaildomain, joindate} = JSON.parse(data);

                    let result = idx + `<br>` + userid + `<br>` + username + `<br>`;
                    result += userpw + `<br>` + emailid + `<br>` + emaildomain + `<br>`;
                    result += joindate + `<br>`;

                    $(".hi").html(result);

                }
            });
        });
    });

</script>
<body>

<form>
<input type="text" name="userId" placeholder="아이디" class="id">
<input type="text" name="userPw" placeholder="비번" class="pw">
<input type="button" id="btn1" value="로그인">
</form>

<p class="hi"></p>


<%--<form action="<%=request.getContextPath()%>/post.do" method="POST">--%>
<%--    이름:<input type="text" name="name">--%>
<%--    점수:<input type="text" name="score">--%>
<%--    <input type="submit" value="Send">--%>
<%--    <input type="reset" value="Reset">--%>
<%--</form>--%>

</body>
</html>
