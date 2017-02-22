<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Add Employee</title>
</head>
<body>   
<h3>Employee</h3>
 <form:form action="add" method="post" commandName="empForm">
 	<form:label path="name"></form:label>
 	<form:input path="name"/><br>
 	
 	<form:label path="salary"></form:label>
 	<form:input path="salary"/><br>
 	
 	<form:label path="age"></form:label>
 	<form:input path="age"/><br>
 
 	<input type="submit" name="addEmp" value="Submit" />
 </form:form>
 
</body>
</html>