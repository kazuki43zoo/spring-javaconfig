<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<body>
<h1>${message}</h1>

<table>
    <tr>
        <th>id</th>
        <th>title</th>
        <th>finished</th>
        <th>created at</th>
    </tr>
    <c:forEach var="todo" items="${todos}">
        <tr>
            <td><c:out value="${todo.todoId}"/></td>
            <td><c:out value="${todo.todoTitle}"/></td>
            <td><c:out value="${todo.finished}"/></td>
            <td><fmt:formatDate value="${todo.createdAt}"
                                pattern="yyyy/MM/dd HH:mm:ss"/></td>
        </tr>
    </c:forEach>
</table>


</body>
</html>