<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>c:if</h1>
    <c:if test="${empty userRole}"><h1>quest</h1></c:if>
    <c:if test="${!empty userRole}"><h1>${userRole}</h1></c:if>
    #################################################### <br/>
    <h1>c:choose</h1>
    <c:choose>
        <c:when test="${empty userRole}"><h1>quest</h1></c:when>
        <c:when test="${!empty userRole}"><h1>${userRole}</h1></c:when>
        <c:otherwise><h1>inny przypadek</h1></c:otherwise>
    </c:choose>
</body>
</html>
