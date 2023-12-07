<%@ page import="src.servlet.model.bean.Employee" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome Screen</title>
</head>
<body>
<table>
<%
    ArrayList<Employee> ListStudent = (ArrayList<Employee>) request.getAttribute("listStudent");
    if(ListStudent != null) {
        for(Employee student : ListStudent) {
%>
    <tr>
        <td><%= student.getId() %>></td>
        <td><%= student.getName() %>></td>
        <td><%= student.getAge() %>></td>
        <td><%= student.getUniversity() %>></td>
    </tr>
<% }
    } %>
</table>
</body>
</html>
