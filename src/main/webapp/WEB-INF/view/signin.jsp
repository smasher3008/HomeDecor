<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log In</title>
</head>
<style>

	body {
			background-image:url("resources/Images/bg4.jpg");
			background-size : cover;
			background-repeat: no repeat;
			background-position: centre;
			}
</style>
<body>
			
		
			
				

			<section class="signin">
			
					<form action="login" method='POST'>
					
					<c:if test = "${not empty error}">
				
					<div class = "error">${error }</div>
					
				</c:if>
							<div align="center">
					
					<h1 font-family: ""Courier New", Courier, monospace">Explore HomeDecor</h1>
						
						<%@ include file = "Head.jsp" %>
			
			
			User name *: <p><input path= "username"  type="text" name="username" /></p>
			 
			Password *:<p> <input path= "password" type="password" name="password" /></p>
			 
			
							<input type="submit" value="Submit" />
			
							<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />
			
							</div>
					</form>
			 
			
			
			 
			
			</body>
</html>