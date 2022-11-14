<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empDept.jsp</title>
</head>
<body>

추후에 화면 출력 <hr/>

<h2>사원 정보 목록보기</h2>

<table border='2'>
<!-- *** 조인할 경우 컬럼명 대문자로 표기할 것 *** -->	
<c:forEach items='${result}' var='empDept'>
      <tr>
         <td>${empDept.EMPNO}</td>
         <td>${empDept.ENAME}</td>
         <td>${empDept.DNAME}</td>
      </tr>
   
   </c:forEach>
</body>
</html>