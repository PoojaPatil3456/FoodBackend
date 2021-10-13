<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<html>
    <style>
    </style>
    <body>
       <table class="table" border="1">
		<tr>
		<th> Comment</th>
		<th> State</th>
		<th> email</th>	
		</tr>
		<c:forEach var="blog" items="${blogs}">
		<tr>
		<td>${blog.comment}</td>
		<td>${blog.stateName}</td>
		<td>${blog.email}</td>
		</tr>
		</c:forEach>
 </table>
    </body>
    
</html>