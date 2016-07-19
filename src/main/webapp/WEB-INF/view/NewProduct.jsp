<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Products</title>
</head>
<body background="resources/image/bg3.jpg">
	
		<%@ include file = "Head.jsp" %>
		


	<form:form method="POST" action="InsertProduct" modelAttribute="Product" enctype="multipart/form-data">
   <table cellspacing="10" align="center">
   
    <tr>
        <td><form:label path="name" type="text" style="font-family:Comic Sans MS">Name</form:label></td>
        <td><form:input path="name" /></td>
    </tr>
    
    
    <tr>
        <td><form:label path="price" type="text" style="font-family:Comic Sans MS">Price</form:label></td>
        <td><form:input path="price" /></td>
    </tr>
    <tr>
        <td><form:label path="manufacturer" type="text" style="font-family:Comic Sans MS">Manufacturer</form:label></td>
        <td><form:input path="manufacturer" /></td>
    </tr>
    <tr>
        <td><form:label path="image"  type="text" style="font-family:Comic Sans MS">Image</form:label></td>
        <td><form:input path="file" type="file" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
	





</html>