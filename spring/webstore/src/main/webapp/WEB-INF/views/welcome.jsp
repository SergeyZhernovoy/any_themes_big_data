<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12.09.2017
  Time: 23:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Welcome</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>${greeting}</h1>
            <p>${tagline}</p>
        </div>
    </div>
</section>
</body>
</html>
