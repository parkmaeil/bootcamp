<%@page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<%
   utility.MyHap my=new utility.MyHap();
   int result=my.hap();
%>
<table border="1">
  <tr>
     <td>총합</td>
     <td><%=result%></td>
  </tr>
</table>
</body>
</html>