<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		
		<title>Revamp Your Way Of Living</title>
		
		
		
				
				<script src="resources/js/angular.min.js"></script>




<body ng-app="mymodule"  background="resources/image/bg5.jpg" width=100% height=100%>

		<%@ include file = "Head.jsp" %>
		
		
		<div data-ng-controller="mycontroller">
				
				<h1>Search In Designer's Pool</h1>
					<br>
						<br>
		 Search : <input type="text" placeholder="Search Products" ng-model="searchtext"  />
					<br>
						<br>
							<br>
								<br>	
									<br>
										
				<table border="1" align ="left" width="40%" color="khaki">
					
				<thead>
							<tr>
								<th style="border:3px solid black; background-color:#3377FF;">Product Name </th>
								<th style="border:3px solid black; background-color:#3377FF;">Product Price </th>
								
							</tr>
				</thead>
						
						<tbody>
						<tr ng-repeat="product in products | filter:searchtext">
							<td align="center">{{product.Name}}</td>	
							<td align="center">{{product.Price}}</td>
							<td align="center"><img data-ng-src= "{{product.Image}}" class="img-responsive img-rounded" width="200" height="200" align="middle"/></td>
						</tr>
						</tbody>
				</table>
		
		
			<img src="resources/image/C7.jpg" width="20%" height="10%" align="center">
				
			
				<table border="1" align ="right" width="40%" color="yellow">
						
					<thead>
						<tr>
							<th style="border:3px solid black; background-color:#3377FF;" >Product Name </th>
							<th style="border:3px solid black; background-color:#3377FF;">Product Price </th>
							<th style="border:3px solid black; background-color:#3377FF;"> Price</th>
							
						</tr>
					</thead>
					
					<tbody>
							
							<tr ng-repeat="product in products | filter:searchtext" ng-init="searchtext='google'">
									
									<td align="center">{{product.Name}}</td>	
									<td align="center">{{product.Price}}</td>
									<td align="center"><img data-ng-src= "{{product.Image}}" class="img-responsive img-rounded" width="200" height="200" align="middle"/></td>
							
							</tr>
					</tbody>
							</table>
									</div>
		
		
<script>
		var myApp = angular.module("mymodule",[]);
		
		myApp.controller("mycontroller",function($scope) {
		
		
		
		var products = ${JSONData};
		$scope.products= products;
		});
		
</script>
		
		
 