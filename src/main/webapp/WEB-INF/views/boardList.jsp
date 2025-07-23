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
    <script>
       function goWriter(){
          //alert("버튼이 클릭됨"); // ajax()->JSON
          location.href="/b01/boardForm";
       }
    </script>
</head>
<body>
게시판리스트(MyBatis DB 연동)
<table border="1">
  <tr>
     <td>번호</td>
     <td>제목</td>
     <td>작성자</td>
     <td>작성일</td>
     <td>조회수</td>
  </tr>
   <c:forEach var="board" items="${bList}">
   <tr>
       <td>${board.num}</td>
       <td>${board.title}</td>
       <td>${board.writer}</td>
       <td>${board.date}</td>
       <td>${board.count}</td>
    </tr>
   </c:forEach>
</table>
<button onClick="goWriter()">글쓰기</button>
</body>
</html>