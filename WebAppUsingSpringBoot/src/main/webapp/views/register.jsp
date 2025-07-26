<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<center>

   <h1>Registration Page</h1>
   <c:if test = "${not empty sucessMsg}">
     <h4 style="color : green;">${sucessMsg}</h4>
   </c:if>
   <c:if test = "${not empty errorMsg}">
     <h4 style="color : red;">${errorMsg}</h4>
   </c:if>
   <hr></hr>
   <form action="regSubmit" method="post">
   Username:
   <br>
   <input type = "text" name="name"/>
   <br>
   <br>
   Password:
   <br>
   <input type = "password" name="pass"/>
   <br>
   <br>
   Email:
   <br>
   <input type = "text" name="email"/>
   <br><br>
   Gender:
   <br>
   <input type = "text" name="gender"/>
   <br><br>
   <input type="submit" value="register">
   </form>
</center>
</body>
</html>