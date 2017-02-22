<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Spring 3 hibernate integration example on www.howtodoinjava.com</title>
</head>
<body>
 
<h2>Employee Management Screen : Spring 3 hibernate integration example on www.howtodoinjava.com</h2>
 

 
     
<h3>Employees</h3>
<c:if  test="${!empty employeeList}">
<table class="data">
<tr>
    <th>Name</th>
    <th>Email</th>
    <th>Telephone</th>
    <th>&nbsp;</th>
</tr>

    <tr>
        <td>${employeeList.empid}</td>
        <td>${employeeList.name}</td>
        <td>${employeeList.salary}</td>
        <td><a href="delete/${employeeList.empid}">delete</a></td>
    </tr>
</table>
</c:if>
 
</body>
</html>