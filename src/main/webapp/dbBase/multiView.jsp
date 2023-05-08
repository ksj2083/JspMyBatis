<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container mt-3">
    <h2>Hover Rows</h2>
    <p>The .table-hover class enables a hover state (grey background on mouse over) on table rows:</p>
    <table class="table table-hover">
        <thead>
        <tr>
            <c:forEach var="entry" items="${list[0]}">
                <th>${entry.key}</th>
            </c:forEach>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="i" items="${list}">
            <tr>
                <c:forEach var="entry" items="${i}">
                    <th>${entry.value }</th>
                </c:forEach>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
