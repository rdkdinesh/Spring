<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Employee</title>
</head>
<body>
 

 

 
     
<h3>Employees</h3>
<c:if  test="${!empty employeeList}">
<table class="data">
<tr>
    <th>Name</th>
    <th>Email</th>
    <th>Salary</th>
    <th>Action</th>
</tr>
<c:forEach items="${employeeList}" var="emp">
    <tr>
        <td>${emp.empid}</td>
        <td>${emp.name}</td>
        <td>${emp.salary}</td>
        <td><a href="delete/${emp.empid}">delete</a></td>
    </tr>
</c:forEach>
</table>
</c:if>
 <a href="add">AddEmp</a>
 
 
 <c:forEach begin="1" end="${count/2}" step="1" varStatus="i">
        <c:choose>
            <c:when test="${page == i.index}">
                <span>${i.index}</span>
            </c:when>
            <c:otherwise>
                <c:url value="/list" var="url">
                    <c:param name="offset" value="${i.index}"/>
                </c:url>
                <a href='<c:out value="${url}" />'>${i.index}</a>
            </c:otherwise>
        </c:choose>
    </c:forEach>
</body>
</html>