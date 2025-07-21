<%@page contentType="text/html;charset=utf-8"%>
<%@page import="entity.*"%>
<%
   Member member=(Member)request.getAttribute("member");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table border="1">
  <tr>
     <td>번호</td>
     <td>이름</td>
     <td>나이</td>
     <td>주소</td>
  </tr>
   <tr>
       <td><%=member.getNum()%></td>
       <td><%=member.getName()%></td>
       <td><%=member.getAge()%></td>
       <td><%=member.getAddr()%></td>
    </tr>
</table>
</body>
</html>