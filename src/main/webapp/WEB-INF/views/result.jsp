<%@page contentType="text/html;charset=utf-8"%>
<%
   Integer result=(Integer)request.getAttribute("result");
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
     <td>총합</td>
     <td><%=result%></td>
  </tr>
</table>
</body>
</html>