<%@page contentType="text/html;charset=utf-8" language="java"
   pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<c:set var="a" value="11" scope="page"/>
${a}
<c:if test="${a%2==0}">
  짝수입니다.
</c:if>
<c:if test="${a%2!=0}">
  홀수입니다.
</c:if>
<c:forEach var="i" begin="1" end="10" step="1">
  <font size="${i}">야호!!</font><br/>
</c:forEach>

<table border="1">
  <tr>
     <td>번호</td>
     <td>이름</td>
     <td>나이</td>
     <td>주소</td>
  </tr>
   <c:forEach var="member" items="${mList}">
   <tr>
       <td>${member.num}</td>
       <td>${member.name}</td>
       <td>${member.age}</td>
       <td>${member.addr}</td>
    </tr>
   </c:forEach>
</table>
</body>
</html>