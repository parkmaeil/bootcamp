<%@page contentType="text/html;charset=utf-8" language="java"
   pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@page import="entity.*,java.util.*"%>

<%
   List<Member> mList=(List<Member>)request.getAttribute("mList");
%>

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

<table border="1">
  <tr>
     <td>번호</td>
     <td>이름</td>
     <td>나이</td>
     <td>주소</td>
  </tr>
  <% for(Member member: mList){  %>
   <tr>
       <td><%=member.getNum()%></td>
       <td><%=member.getName()%></td>
       <td><%=member.getAge()%></td>
       <td><%=member.getAddr()%></td>
    </tr>
   <% } %>
</table>
</body>
</html>